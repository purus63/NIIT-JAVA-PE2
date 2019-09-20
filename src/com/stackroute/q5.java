package com.stackroute;

import java.util.InputMismatchException;
import java.util.Scanner;


public class q5{

    public static void main(String[] args) {

        int number=0,temp=0;
        System.out.println("Enter number of student");

        boolean flag = false;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number <= 0)
                    System.out.println("Enter valid Input");
                else
                    flag = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Error : Not a Number");
                System.out.println("Enter valid Input");
            }
            if(flag==true)
                break;
        }
        int i=0;flag=false;
        int sum=0,mini=100,maxi=0;
        while(true){

            if(flag== true && i==number)
                break;
            try {
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter the grade for Student  " + (i+1));
                    temp= sc.nextInt();
                    if (temp < 0 || temp >100)
                        System.out.println("Enter the valid grade for Student  "+ (i+1));
                    else
                    {
                        mini=Math.min(mini,temp);
                        maxi=Math.max(maxi,temp);
                        sum+=temp;
                        flag = true;i++;
                    }
                }

            catch (InputMismatchException e)
            {
                System.out.println("Error : Not a Number");
            }

        }
        System.out.println("The average is :"+ ((float)sum/number));
        System.out.println("The minimum is "+mini);
        System.out.println("The maximum is "+maxi);
    }
}
