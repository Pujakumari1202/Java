package com.company;
class mythreadrunnable1 implements  Runnable{
    public void run(){
        int i=0;
        for(i=0;i<10;i++) {
            System.out.println("i am a runnable thread1");
        }
    }
}
class mythreadrunnable2 implements  Runnable{
    public void run(){
        int i=0;
        for(i=0;i<10;i++) {
            System.out.println("i am a runnable thread2........");
        }
    }
}
public class thread_runnableinterface_71 {
    public static void main(String[] args) {
        Thread gun1=new Thread(new mythreadrunnable1());// mythreadrunnable1 bullet1=new mythreadrunnable1();Thread gun1=new Thread(mythreadrunnable1())
        //Thread gun1=new Thread(bullet1);
        mythreadrunnable2 bullet2=new mythreadrunnable2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();

    }

}
