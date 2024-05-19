package com.company;
class myth1 extends  Thread{
    public myth1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<19) {
            System.out.println("Thank you " +this.getName());
            i++;
        }
    }
}
public class priiority_thread_74 {
    public static void main(String[] args) {
        myth1 t1=new myth1("puja");
        myth1 t2=new myth1("puja2");
        myth1 t3=new myth1("puja3");
        myth1 t4=new myth1("puja4");
        myth1 t5=new myth1("puja5(MOST  IMPORTANT");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
