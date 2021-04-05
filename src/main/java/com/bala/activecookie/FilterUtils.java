package com.bala.activecookie;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterUtils {

    public void filterListByDateStream(String date , List<Data> dataList){

        List<Data> filteredList = dataList.stream()
                .filter(datematch -> date.equals(datematch.getDate()))
                .collect(Collectors.toList());

        Map<String,Integer> cookieCounter = filteredList.stream()
                .collect(Collectors.toMap(cookie -> cookie.getCookieName(),cookie -> 1 ,Integer::sum));

        int maxValueInMap =(Collections.max((cookieCounter.values())));

        for(Map.Entry<String,Integer> entry : cookieCounter.entrySet()){
            if(maxValueInMap > 1 && entry.getValue() == maxValueInMap) {
                System.out.println("Most active cookie :" + entry.getKey());
            }
        }

    }
}
