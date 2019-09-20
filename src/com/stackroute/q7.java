package com.stackroute;

import java.util.Scanner;


public class q7
    {
        public static void main(String[] args) {
            User user=new User();
            user.setFirstName("Hari");
            user.setLastName("Sadu");
            user.setAge(21);
            user.setSalary(1100.34);
            System.out.println(user.getName());
        }
    }

    class User
     {
       private String firstName;
       private String lastName;
       private int age;
       private double Salary;

       public void isValidAge(int num1){
           if(num1>=18 && num1<=60)
               System.out.println("Valid age");
           else
               System.out.println("Invalid age");
       }

        public String getName(){
            return firstName+" "+lastName;
        }
        public int getAge(){
            return age;
        }
        public double getSalary(){
            return  Salary;
        }

        public void setFirstName(String fName){ this.firstName=fName;}
         public void setLastName(String lName){this.lastName=lName;}
         public void setAge(int age1)
         {
            if(age1<0 || age1>100)
               throw new IllegalArgumentException();
            else
            {
                this.age=age1;
            }
         }

         public void setSalary(double salary){this.Salary=salary;}
     }
