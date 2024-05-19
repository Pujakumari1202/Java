package com.company;

class this_super{
    int x=5;

    public int getX() {
        return x;
    }
    this_super(int x){
        this.x=x;
    }
}
class super1{
    int x;
    public int get(){
        return x;
    }

    super1(int x) {
        this.x=x;
    }
    public int returnone(){
        return 1;
    }
}
class child1 extends super1{
    child1(int c) {
        super(c);
        System.out.println("i am a derived class");

    }

}
public class super_47 {
    public static void main(String[] args) {
      // this_super th=new this_super(65);
        //System.out.println(th.getX());
     super1 s=new super1(3);
     child1 c1=new child1(5);
        System.out.println(s.get());


    }
}
