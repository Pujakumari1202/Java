package com.company;
class c1{
    public int x=5;
    protected int y=67;
    int z=2;
    private int a=9;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}
public class access_modi_66 {
    public static void main(String[] args) {
    c1 c=new c1();
    c.meth1();
    System.out.println(c.x);
    System.out.println(c.y);
    System.out.println(c.z);
    //System.out.println(c.a);
    }
}
