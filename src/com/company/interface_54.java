package com.company;
interface  Bicycle{
     int a=8;
     // final int a=8;
     public void applybrake(int decrement);
     void speedup(int increment);
}
interface hornbicycle{
     void blowhorn();
     void hornblow();
}
class autocycle implements Bicycle{
     int speed=7;
     void greett(){
          System.out.println("Good morning");
     }
     public void applybrake(int decrement){
          speed=speed-decrement;
          System.out.println(speed);

     }
     public void speedup(int increment){
          speed=speed+increment;
          System.out.println(speed);
     }
     public void blowhorn(){
          System.out.println("heloooo");
     }
     public void hornblow(){
          System.out.println("hiii");
     }

}

public class interface_54 {
     public static void main(String[] args) {
          autocycle a1=new autocycle();
          a1.applybrake(2);
          a1.speedup(8);
          a1.blowhorn();
          a1.hornblow();
          // you can create properties in interface
          // you cant modify the properties of interface bcoz they are final
          //a1.a();//error
     }
}
