package com.company;

import java.util.Scanner;

public class webside {
    public static void main(String[] args) {
        System.out.println("enter your website name");
        Scanner sc=new Scanner(System.in);
        String websi=sc.next();
        if(websi.endsWith(".org"))
             System.out.println("this is an organization website");
        else if(websi.endsWith(".com"))
              System.out.println("this is a commercial website");
        else if(websi.endsWith(".in"))
              System.out.println("this is an indian website");

    }
}
