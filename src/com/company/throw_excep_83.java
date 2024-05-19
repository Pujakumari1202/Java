package com.company;

import java.util.Scanner;

class myclass extends Exception{
    @Override
    public String getMessage() {
        return "make sure the value of age is entered is correct";
    }
    public String toString() {
        return "age cant be more than 125";
    }
}

public class throw_excep_83 {
    public static void main(String[] args) {try {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99)
            throw new ArithmeticException("this is an exception");
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        System.out.println(e);
        e.printStackTrace();
        System.out.println("finally");

    }
        System.out.println("yes finished");

    }
}
