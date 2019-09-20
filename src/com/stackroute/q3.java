package com.stackroute;

import java.util.Scanner;

class Member {
    String Name;
    int Age;
    double Salary;

    void insert(String name, int age, double salary) {
        Name = name;
        Age = age;
        Salary = salary;
    }
    void display()
    {
        System.out.println("Member Name :"+Name);
        System.out.println("Member Age:"+Age);
        System.out.println("Members Salary :"+Salary);

    }
}
class Membervariable{

    public static void m1(String name,int age,double salary) {
        Member mem = new Member();
        mem.insert(name,age,salary);
        mem.display();
    }
}




public class q3 {

    public static void main(String[] args) {

        Membervariable.m1("Harry",30,2500.3);
    }
}