package com.uxteam.starget.app_utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static String getNowShortTime() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy:MM:dd");
        return df.format(date);
    }

    public static String getNowLongTime() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy:MM:dd hh:mm");
        return df.format(date);
    }

    public static String getNowWeek() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("EEEE");
        return df.format(date);
    }

    public static String getNextDay() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, +1); //今天的时间加一天
        date = calendar.getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy:MM:dd");
        return df.format(date);
    }
}