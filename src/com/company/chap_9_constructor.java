package com.company;

class cylinder{
    int radius;
    int height;
    
    public int getHeight()
    {
        return height;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getRadius()
    {
        return radius;
    }


}
class surfacearea {
    int h;
    int r;
    int surface;
    int volume;
    public  int surface(){
        surface=2*(22/7)*r*h+2*(22/7)*r*r;
        return surface;
    }
    public int volume(){
        volume=(22/7)*r*r*h;
        return volume;
    }
}


class constructorcylinder{
    int h;
    int r;
    constructorcylinder(){
        h=8;
        r=7;
        System.out.println(h);
        System.out.println(r);
    }
    constructorcylinder(int length,int breadth){
        System.out.println("i am a overloaded construtor of length: " + length);
        System.out.println("i am a overloaded construtor of breadth: " + breadth);
    }
}

class sphere{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


public class chap_9_constructor {
    public static void main(String[] args) {
        cylinder cy=new cylinder();
        cy.setHeight(5);
        cy.setRadius(6);
       // System.out.println(cy.getHeight());
        //System.out.println(cy.getRadius());
        surfacearea sr=new surfacearea();
        sr.r=6;
        sr.h=9;
       // System.out.println(sr.surface());
       // System.out.println(sr.volume());
       // constructorcylinder cc=new constructorcylinder();
        //constructorcylinder cr=new constructorcylinder(8,9);
        sphere sp=new sphere();
        sp.setRadius(40);
        System.out.println(sp.getRadius());
        sp.setHeight(2* sp.getRadius());
        System.out.println(sp.getHeight());

    }
}
