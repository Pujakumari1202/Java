package com.company;
/*class mycons extends Thread{
    public mycons(String name){
        super(name);

    }
    public void run(){
        int i=0;
        while(i<19) {
            System.out.println("i am a thread constructor....");
            i++;
        }
    }
}
public class constructor_thread_71 {
    public static void main(String[] args) {
        mycons c=new mycons("Puja.");
        mycons c1=new mycons("Arunn.");
        c.start();
        c1.start();
        System.out.println("The id of the thread is " + c.getId());
        System.out.println("The name of the thread is " + c.getName());
        System.out.println("The id of the thread is " + c1.getId());
        System.out.println("The name of the thread is " + c1.getName());

    }

}*/
class myrunnable extends Thread implements Runnable {
    myrunnable(String name){
       super(name);
    }
    public void run(){
     int i=0;
     for(i=0;i<10;i++){
         System.out.println("i am a runnable constructor class......");
     }
    }
}
public class constructor_thread_71 {
    public static void main(String[] args) {
        myrunnable mr=new myrunnable("puja");
        Thread t1=new Thread(mr,"puja");
        myrunnable mr2=new myrunnable("pujaaaaaa");
        Thread t2=new Thread(mr2,"pujaaaa");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is " + t1.getId());
        System.out.println("The name of the thread is " + t1.getName());
        System.out.println("The id of the thread is " + t2.getId());
        System.out.println("The name of the thread is " + t2.getName());

    }

}
