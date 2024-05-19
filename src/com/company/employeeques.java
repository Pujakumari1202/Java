package com.company;
import java.util.Scanner;

class employee2{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

class cellphone{
    public void ring(){
        System.out.println("ringing..........");
    }
    public void vibtate(){
        System.out.println("vibtating........");

    }
    public void callfriend(){
        System.out.println("calling friend.......");
    }
}


class square{
    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int breadth;
    int length;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }

}

class tommy{
    public void hit(){
        System.out.println("hitting the  enemy.......");

    }
    public void run(){
        System.out.println("running form the enemy......");

    }
    public void fire(){
        System.out.println("firing on the enemy......");

    }
}



 class circle1{
    int radius;
    int area1;
    int circumference;
        public int cirarea(){
            area1= (22/7)*radius*radius;    //incomplete
            return area1;

    }
       public int circircumference(){
        area1= 2*(22/7)*radius;    //incomplete
        return area1;

    }
 }


class circle{
    int radius;
    int area;
    int circumference;
        public int cirarea(){
             area = (22/7)*radius*radius;
             return area;
        }
        public int circircumference(){
              circumference = 2*(22/7)*radius;
              return circumference;
        }
        }


public class employeeques {
    public static void main(String[] args) {
        System.out.println("print all the details about employee:");
        employee2 puja=new employee2();
        puja.setName("codewithpuja");
        puja.salary=34;
        //System.out.println(puja.getSalary());
       // System.out.println(puja.getName());
        cellphone oppo=new cellphone();
        oppo.ring();
        oppo.vibtate();
        oppo.callfriend();


        //System.out.println("enter the side:");
        //Scanner sc=new Scanner(System.in);
       // int s=sc.nextInt();

        square sq=new square();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


        rectangle rt=new rectangle();
        rt.length=4;
        rt.breadth=5;
        System.out.println(rt.area());
        System.out.println(rt.perimeter());


        tommy to=new tommy();
        to.hit();
        to.fire();
        to.run();


        circle1 ci=new circle1();
        ci.radius=5;
        System.out.println(ci.cirarea());
        System.out.println(ci.circircumference());
    }
}
