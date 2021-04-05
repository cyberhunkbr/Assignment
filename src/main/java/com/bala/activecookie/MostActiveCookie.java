package com.bala.activecookie;

import org.apache.commons.cli.*;

public class MostActiveCookie {

    public static void main(String args[]){
        String filePath = "";
        String date ="";
        CommandLine commandLine ;
        Option option_f = Option.builder("f")
                .required(true)
                .desc("The file name parameter")
                .hasArg()
                .longOpt("opt1")
                .build();
        Option option_d = Option.builder("d")
                .required(true)
                .desc("The date  parameter")
                .hasArg()
                .longOpt("opt2")
                .build();
        Options options = new Options();
        CommandLineParser parser = new DefaultParser();

        options.addOption(option_f);
        options.addOption(option_d);
        try{

            commandLine = parser.parse(options,args);

            if(commandLine.hasOption("f")&& commandLine.hasOption("d")){
                filePath = commandLine.getOptionValue("f");
                date = commandLine.getOptionValue("d");
            }
        }catch (ParseException parseException){
            System.out.println("Invalid input :"+parseException.getMessage());
        }

        if(null !=filePath && null !=date){
            FileReader fileReader = new FileReader();
            FilterUtils filterUtils = new FilterUtils();
            filterUtils.filterListByDateStream(date,fileReader.readFile(filePath));
        }

    }
}
