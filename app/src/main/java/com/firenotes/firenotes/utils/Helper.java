package com.firenotes.firenotes.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by WIN 10 on 6/24/2017.
 */

public class Helper {

    public static String getCurrentDate(){
        try {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy");
            String formattedDate = df.format(calendar.getTime());
            return formattedDate;

        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
