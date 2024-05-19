package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class collection_date_time_formatter_101 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m a");
        DateTimeFormatter df1=DateTimeFormatter.ISO_DATE_TIME;
        String MYdate=dt.format(df);
        System.out.println(MYdate);

        String MYdate1=dt.format(df1);
        System.out.println(MYdate1);

    }
}
