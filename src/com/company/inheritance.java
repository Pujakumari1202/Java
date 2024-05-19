package com.company;

class base{
    public int x;
    public void setX(int x) {
        System.out.println("i mam a constructor of base class:");
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public void printme(){
        System.out.println("i am a constructor.......");
    }
}
class Derived extends base{
    public int y;

    public int getY(){
        return y;

    }
    public void setY(int y){
        System.out.println("i am a derived class.......");
        this.y=y;
    }

}
public class inheritance {
    public static void main(String[] args) {
       // base b=new base();
        //b.setX(6);
        //System.out.println(b.getX());

        Derived d=new Derived();
        d.setX(5);
        System.out.println(d.getX());
        d.setY(7);
        System.out.println(d.getY());


    }
}
