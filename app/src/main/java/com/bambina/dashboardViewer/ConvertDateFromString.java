package com.bambina.dashboardViewer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hirono-mayuko on 2017/04/25.
 */

public class ConvertDateFromString {
    public static Date parse(String date, SimpleDateFormat format){
        Date d = new Date();
        try{
            d = format.parse(date);
        } catch (ParseException e){
            e.printStackTrace();
        }
        return d;
    }
}
