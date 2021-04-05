package com.bala.activecookie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    List<Data> mylist = new ArrayList<Data>();
    DateUtils dateUtils = new DateUtils();

    public List<Data> readFile(String filePath){
        try(Scanner scanner = new Scanner(new File(filePath))){
            scanner.nextLine();
            while (scanner.hasNext()){
                String [] data = scanner.nextLine().split(",");
                Data d = new Data();
                d.setCookieName(data[0]);
                d.setDate(dateUtils.parseDate(data[1]));
                mylist.add(d);
            }

        }catch(FileNotFoundException fileNotFoundException){
            System.out.println("File not found :"+fileNotFoundException.getMessage());
        }

    return mylist;
    }
}
