package com.company;
interface mycamera2{
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
interface mywifi2{
    String [] getnetwork();
    void connecttonetwork(String network);

}
class myphone2{
    void cellnumber(int phoneno){
        System.out.println("calling"+phoneno);
    }
    void calling(){
        System.out.println("ringing");
    }

}
class smartphone2 extends myphone implements mycamera2,mywifi2{
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


public class polymor_59 {
    public static void main(String[] args) {
       mycamera2 ca1=new smartphone2();
       ca1.takingsnap();// This is a smartphone but, use it as a camera
      // ca1.calling();//not allowed
        smartphone sm=new smartphone();
        sm.recording();
        sm.recordvideo();
        sm.getnetwork();

    }
}
