package com.company;

class employee4{
     private int id;
     private String name;
     public employee4(){
        id=67;
        name="code";

    }
    public employee4(String myname){
         id=34;
         name=myname;
    }
    public employee4(String myname,int myid){
        id=myid;
        name=myname;
    }


    public String getName()
      {
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

public class newemployee {
    public static void main(String[] args) {
        employee4 puja=new employee4();
        employee4 puja1=new employee4("leeminho");
        employee4 puja2=new employee4("leeminho",33);

        //puja.setId(56);
        //puja.setName("PUJA");
        System.out.println(puja2.getId());
        System.out.println(puja2.getName());

    }
}
