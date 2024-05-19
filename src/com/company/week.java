package com.company;
import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        System.out.print("enter your day:");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        // enhanced switch case
        switch(day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thusday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");

        }
        System.out.println("enter year:");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if(year%2==0 &&year%100==0)
            System.out.println("year is leap year:");
        else
            System.out.println("not leap year:");

    }
}
