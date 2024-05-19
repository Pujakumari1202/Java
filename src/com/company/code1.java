package com.company;

        class Employee{
            int Salary;
            String name;

            public int getSalary(){
                return Salary;
            }
            public String getName(){
                return name;
            }
            public void setName(String n){
                name=n;
            }
        }
        public class code1 {
            public static void main(String[] args) {
                Employee puja=new Employee();
                puja.setName("pujakumari");
                puja.Salary=400;
                System.out.println(puja.getSalary());
                System.out.println(puja.getName());
            }
        }


