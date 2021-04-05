package com.bala.activecookie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class DateUtils {

    public String parseDate(String utcdate) throws DateTimeParseException{
        String formattedDate = "";
        try{
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss+SS:SS", Locale.ENGLISH);
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd",Locale.ENGLISH);
            LocalDate date = LocalDate.parse(utcdate,dateTimeFormatter);
            formattedDate = outputFormatter.format(date);

        }catch (DateTimeParseException dateTimeParseException){
            System.out.println("Invalid date : "+ dateTimeParseException.getMessage());
            formattedDate="";
        }
        return formattedDate;
    }

}
