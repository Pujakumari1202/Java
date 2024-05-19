package com.company;

class employee3{
     private int id;
     private String name;

    public String getName() {
        return name;
    }
    public void setName(String n){
         this.name=n;
    }

    public int getId() {
        return id;
    }
    public  void setId(int i){
        id=i;
    }
}
public class getemployee {
    public static void main(String[] args) {
        System.out.println("getting and setting id and name:");
        employee3 puja=new employee3();
        puja.setName("codewithpuja");
        System.out.println(puja.getName());
        puja.setId(45);
        System.out.println(puja.getId());

    }
}
