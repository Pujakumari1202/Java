package com.company;

import javax.swing.*;

interface mycamera{
        void takingsnap();
        void recordvideo();
        private void greet(){
            System.out.println("Gooddd morning....");
        }
        default void recording(){
            greet();
            System.out.println("recod the video");
        }
}
interface mywifi{
    String [] getnetwork();
    void connecttonetwork(String network);

}
class myphone{
    void cellnumber(int phoneno){
        System.out.println("calling"+phoneno);
    }
    void calling(){
        System.out.println("ringing");
    }

}
class smartphone extends myphone implements mycamera,mywifi{
    public void takingsnap(){
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("taking snap");
    }
    public String [] getnetwork(){
        System.out.println("getting list of network");
        String []networklist={"harry,puja,arun"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connercting to"+network);
    }

}

public class defau_interface_57 {
    public static void main(String[] args) {
        smartphone sm=new smartphone();
        sm.recordvideo();
        sm.takingsnap();
        String[] ar=sm.getnetwork();
        for(String iten:ar){
            System.out.println(iten);
        }
        sm.recording();
        // sm.greet(); --> Throws an error!
    }
}
