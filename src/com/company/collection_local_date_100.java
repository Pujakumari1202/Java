package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class collection_local_date_100 {
    public static void main(String[] args) {
        LocalDate l=LocalDate.now();
        System.out.println(l);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime lt=LocalDateTime.now();
        System.out.println(lt);
    }
}
