package com.company;
class circle2{
    public int radius;
    circle2() {
        System.out.println("i am a circle constructor");
    }
    circle2(int r){
        System.out.println("i am a circle  parametrized constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends  circle2{
    public int height;
    cylinder1(int r ,int h){
        super(r);
        System.out.println("i am a cylinder class parametrized constructor.....");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}

public class practice_10 {
    public static void main(String[] args) {
        circle2 c=new circle2(5);
        cylinder1 c1=new cylinder1(6,7);
    }
}
