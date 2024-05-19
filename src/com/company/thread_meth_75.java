package com.company;
class myclasss1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("Thank you");
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException i1){
                i1.printStackTrace();
            }
            i++;
        }
    }
}
class myclasss2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("Thank you........");
            i++;
        }
    }
}
public class thread_meth_75 {
    public static void main(String[] args) {
          myclasss1 m1=new myclasss1();
          myclass2 m2=new myclass2();
        /*  m1.start();
          try{
              m1.join();
          }
          catch (Exception e){
              System.out.println(e);
          }

         */
          m2.start();
    }
}
