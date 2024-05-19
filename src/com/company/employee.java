package com.company;

class Employee1 {
    int id;
    int Salary;
    String name;

    public void print() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return Salary;

        }
    }

public class employee {
    public static void main(String[] args) {
        System.out.println("our custom class");
        Employee1 puja=new Employee1();
        puja.id=12;
        puja.name="codewithpuja";
        puja.Salary=67;
        //System.out.println(puja.id);
        //System.out.println(puja.name);
        //puja.print();
        //int Salary = puja.getSalary();
       // System.out.println(Salary);
    }
}

/*
class Employee1 {
    int id;
    int Salary;
    String name;

    public void print() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);

    }
}
public class employee {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1(); // Instantiating a new Employee Object
        // Setting Attributes for Harry
        harry.id = 12;
        harry.Salary = 34;
        harry.name = "CodeWithHarry";
        // Printing the Attributes
        harry.print();
    }
}
*/