package com.company;
abstract class parents{
    public parents(){
        System.out.println("i am a parents class constructor");
    }
    public void sayhello(){
        System.out.println("hello");

    }
    abstract public void greet();
    abstract public void greet1();
}
class chi1 extends parents{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet1(){
        System.out.println("Good afternoon");
    }
     public void th1(){
        System.out.println("i am good girl");
    }
}
abstract class chi2 extends parents{
    public void th(){
        System.out.println("i am good");
    }
}

public class abstract_53 {
    public static void main(String[] args) {
        chi1 c=new chi1();
        c.greet();
        c.greet1();
        parents p=new chi1();
        p.greet();

       // parents p=new parents() ;//error
        //chi1 c1=new chi1(); //error (abs class is a standard not a class so its object cant be created)
    }
}
