package com.company;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc=new Scanner(System.in);
        System.out.print("math:");
        m1 = sc.nextByte();
        System.out.println("physics:");
        m2 = sc.nextByte();
        System.out.println("chemistry:");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        if (avg >= 40 && m1 > 33 && m2 > 33 && m3 > 33)
            System.out.println("congratulations you are passed!!!!!!");
        else
            System.out.println("sorry,you are failed:");
    }
}
