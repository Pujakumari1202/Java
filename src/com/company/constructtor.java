package com.company;

class base1{
    base1()
    {
        System.out.println("i am a constructor:");
    }
    base1(int x)
    {
        System.out.println("i am a overloaded constructor with value of x1 " + x );
    }
}
class derived1 extends base1{

    derived1(){
        super(0);
        System.out.println("i am a derived class constructor:");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("i am a overloaded constructor with values of  y " + y);
    }
}

class childofderived1 extends derived1{
    childofderived1(){
        System.out.println("i am a child of derived class constructor:........");
    }
    childofderived1(int x,int y,int z){
        super(x,y);
        System.out.println("i am a child of derived of overloaded constructor: "+ z);
    }
}
public class constructtor {
    public static void main(String[] args) {
        base1 b=new base1();
        derived1 d=new derived1();
        childofderived1 c=new childofderived1();

    }
}
