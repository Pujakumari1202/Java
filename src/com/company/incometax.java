package com.company;
import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0;
        if (income <= 2.5f)
            tax = tax + 0;
        else if (income > 2.5f && income <= 5.f)
            tax = tax + 0.05f * (income - 2.5f);
        else if (income > 5f && income <= 10f)
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
     //   else
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
       }






    }
