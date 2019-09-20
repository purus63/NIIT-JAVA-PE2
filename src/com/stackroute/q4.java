package com.stackroute;

import java.util.Scanner;



public class q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean bool=EvenNumTest.isEven(number);
        if(bool)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

    }
}
class EvenNumTest{
    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }
}