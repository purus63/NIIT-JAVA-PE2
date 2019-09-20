package com.stackroute;

import java.util.Scanner;


public class q2 {

    //
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();


          if(power4(number))
              System.out.println(number + " is power of 4");
          else
              System.out.println(number + " is not power of 4");

    }

    public static boolean power4(int num1)
    {
        boolean flag=false;
        while(true)
        {
            if(num1%4==0)
            {
                num1=num1/4;
                if(num1==4)
                {
                    flag=true;
                    break;
                }
            }
            else
                {
                    break;
                }

        }
        return flag;
    }

}
