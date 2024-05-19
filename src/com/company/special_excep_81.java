package com.company;

import java.util.Scanner;

public class special_excep_81 {
    public static void main(String[] args) {
        try {
            int[] a = new int[4];
            a[0] = 3;
            a[1] = 4;
            a[2] = 8;
            a[3] = 9;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the array index");
            int s = sc.nextInt();
            System.out.println("enter the no you want to divide with");
            int num = sc.nextInt();
            System.out.println("the value of array at index is" + a[s]);
            System.out.println("tha value of array no is" + a[s] / num);
        }
    catch(ArithmeticException  e){
            System.out.println("the ArithmeticException occurred");
            System.out.println(e);

        }
        catch(ArrayIndexOutOfBoundsException  e){
            System.out.println("the ArrayIndexOutOfBoundsException  occurred");
            System.out.println(e);

        }
        catch(Exception  e){
            System.out.println("some other exception  occurred");
            System.out.println(e);

        }

    }
}
