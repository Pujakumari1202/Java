package com.company;
import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        System.out.println("enter the no :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.printf("%d x %d=%d\n", n, i, n * i);
        }


        int n1=10;
        for(int j=10;j>0;j--){
            System.out.printf("%d x %d=%d\n",n1,j,n1*j);
        }


        int n2=4;
        int fact=1;
        int k=1;
        for(k=1;k<=n2;k++){
            fact=fact*k;

        }
        System.out.println(fact);


        int n3=8;
        int sum=0;
        for(int h=1;h<=10;h++) {
            sum = sum + (n3 * h);
        }
        System.out.println(sum);

    }
}
