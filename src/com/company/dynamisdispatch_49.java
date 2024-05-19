package com.company;
class basss{
    public void greet(){
        System.out.println("Good morning");
    }
    public void method1(){
        System.out.println("i am a base class method");
    }

}
class chi extends basss{
    public void method2(){
        System.out.println("i am a child1 class method");
    }
    public void method1(){
        System.out.println("i am a base class method");
    }
}

public class dynamisdispatch_49 {
    public static void main(String[] args) {
        basss s=new chi();
        s.method1();
        s.greet();

    }
}

