package com.levelup.lesson1;

/**
 * Created by Anna on 21.02.2016.
 */


import java.util.Scanner;


public class Main {

       public static void main (String arg[]) throws Exception {

          Scanner scanner = new Scanner(System.in);

           System.out.println("This program will calculate x in linear equation ax + b = 0");
           System.out.println("Please enter any number:");
           System.out.print("a:");
           int a = scanner.nextInt();

           System.out.println("Please enter any number:");
           System.out.print("b:");
           int b = scanner.nextInt();

           if (a == 0) {
               System.out.println("**There are no solutions**");
           }
           else {
               double x = -b / a;
               System.out.println("****Solution****");
               System.out.println("x = " + x);
           }

       }
}
