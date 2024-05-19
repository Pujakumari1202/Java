package com.company;
class NegativeRadiusException extends Exception{
    @Override
    public String getMessage() {
        return "negative radius not possible";

    }

    @Override
    public String toString() {
        return "radius cont be negative";
    }
}

public class throws_excp_84 {
    public static double negativeare(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
    double result = Math.PI * r * r;
        return result;
}
    public static  int divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;

    }
    public static void main(String[] args) {try {

        //int c = divide(6, 0);
        //System.out.println(c);
        double ar=negativeare(6);
        System.out.println(ar);
    }
    catch (Exception e){
        System.out.println(e);
    }
    }
}
