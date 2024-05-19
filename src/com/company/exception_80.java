package com.company;

public class exception_80 {
    public static void main(String[] args) {try {
        int a = 666;
        int b = 0;
        int c = a / b;
        System.out.println("output is:" + c);
    }
    catch (Exception e){
        System.out.println("we fail to devide ");
        System.out.println(e);
    }
    }
}
