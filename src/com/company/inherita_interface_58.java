package com.company;

import javax.imageio.stream.ImageInputStream;

interface sample{
    void meth1();
    void meth2();

}
interface  childsample extends sample{
    void meth3();
    void meth4();

}
class inter_inheri implements childsample{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");
    }
    public void meth3(){
        System.out.println("method 3");
    }
    public void meth4(){
        System.out.println("method 4");
    }

}

public class inherita_interface_58 {
    public static void main(String[] args) {
        inter_inheri i=new inter_inheri();
        i.meth1();
        i.meth2();
        i.meth3();
        i.meth4();
    }
}

