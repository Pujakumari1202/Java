package com.company;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.Callable;

public class collection_calender_class_98 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        Calendar c1=Calendar.getInstance();
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone().getID());
    }
}
