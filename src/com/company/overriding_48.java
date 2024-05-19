package com.company;
class bas{
    public  int a;
    public int puja(){
        return 5;
    }
    public void meth2(){
        System.out.println("i am a base class method2");
    }

}
class chil extends bas{
    @Override
    public int puja() {
        return super.puja();
    }

    public void meth2(){
        System.out.println("i am a child class method2");
    }
    public void meth3(){
        System.out.println("i am a child class method3");
    }
}

public class overriding_48 {
    public static void main(String[] args) {
        bas b=new bas();
        b.meth2();
        chil c=new chil();
        c.meth2();
        c.meth3();
    }
}
