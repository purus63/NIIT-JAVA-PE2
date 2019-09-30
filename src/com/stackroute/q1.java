package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;


public class q1 {

//    public static void main(String[] args) {
//
//        Scanner sc =new Scanner(System.in);
//        String string= sc.nextLine();
//        String[] revString = palindromecheck(string); /*include static method in the function to run from main block  */
//            for(String str :revString)
//            System.out.println(str);
//
//    }


    public static String[] palindromecheck(String str){

        int  len =str.length();
        String rev="";
        if(len==0)
            return null;
        ArrayList<String> list=new ArrayList<String>();

        for(int i=0;i<len;i++)
        {
            rev = str.charAt(i)+rev;
        }
        if(rev.equals(str))
            list.add("The string is palindrome");
        else
            list.add("The string is not palindrome");
        list.add(rev);
        System.out.println(list);
        return list.toArray(new String[list.size()]);
    }


}
