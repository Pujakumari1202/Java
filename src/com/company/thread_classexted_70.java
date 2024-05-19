package com.company;
class myclass1 extends Thread{
    public void run(){
        int i=0;
        while(i<10) {
            System.out.println("i am a extends class thread1");
            System.out.println("i am happy");
            i++;
        }
    }
}
class myclass2 extends Thread{

        public void run(){
            int i=0;
            while(i<10){
            System.out.println("i am a extends class thread2......");
            System.out.println("i am saddddd...");
            i++;
        }

    }
}
public class thread_classexted_70 {
    public static void main(String[] args) {
        myclass1 c1=new myclass1();
        myclass2 c2=new myclass2();
        c1.start();
        c2.start();
    }
}
//void sum(int a,int b)--------parameters
//sum(6,7)--------arguments means actual value
// concurrency-----at a time doing more jobs at a particular instance(use in threading)
//parallelism------at a time doing one job but managing more than one job