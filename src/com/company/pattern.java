package com.company;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=n;i>0;i--){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        int sum=0;
        System.out.println("enter the nos:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int k=0;k<a;k++) {
            sum = sum + (2 * k);
        }
        System.out.println("sum of n even nos is :");
        System.out.println(sum);
        //first 4 even nos are 0,2,4,6






        }
    }

