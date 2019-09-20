package com.stackroute;

import java.util.Scanner;


public class q6 {

    public static void intfactorial(int number)
    {
        int lli =1;
        for(int i=number;i>=1;i--)
            lli*=i;
        System.out.println("The factorial of  "+number +"is "+lli);
    }


    public static void longfactorial(int number)
    {
        long lli =1;
        for(long i=number;i>=1;i--)
            lli*=i;
        System.out.println("The factorial of  "+number +"is "+lli);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number<=12)
            intfactorial(number);
        else
          {
              if(number<=20)
                  longfactorial(number);
              else
                  System.out.println("The factorial of "+number+ " is out of range");
          }

    }
}