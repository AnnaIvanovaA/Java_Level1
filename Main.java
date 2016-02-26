package com.levelup.lesson3;

import java.util.Scanner;


/**
 * Created by Student-25 on 25.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        //int i = 0;

      //  while (i < 10) {
      //      //iteration
      //      System.out.println("I love Java " + i);
      //      i = i + 1;
     //   }

        // 1 2 3
        // a b ch
/*
        i = 1;
        char ch = 'a';

        while (ch < 'd'){
            while (i < 4){
                System.out.println(ch + " " + i);
                //ch = (char)(ch+1)
                i ++;
            }
            ch ++;
            i = 1;
        }
*/

        int x = 4;
        x = x + 3;
        x += 3;
        x -= 7;
        x ++; // increment
        x --; //decrement

      /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        int a = scanner.nextInt();
        System.out.println("b:");
        int b = scanner.nextInt();
        System.out.println("c:");
        int c = scanner.nextInt();
        System.out.println("d:");
        int d = scanner.nextInt();

        int i = a;
        int k = c;
        while (i < b){
            while (k < d){
                int result = i * k;
                //System.out.print(result + " \t\t");
                System.out.printf("%4d", result);

                k ++;
            }
            i ++;
            k = c;
            System.out.println();
        }
        */

       // for (int j = 0; j<10; j++){
      //      System.out.println(j);
      //  }
/*
        int[] array = new int[20];  //all 0s, not nulls
        //array[0] = 76;
        //array[1] = array[0]*3;

        for (int i = array.length-1; i >= 0; i--){
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++){
            array[i] = array.length - i -1;   //в обратном порядке
            //break;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
*/

        int array[] = new int[10];

                //-347..935
        for (int i = 0; i < array.length; i++){
            //array[i] = (int) (Math.random() * 100 - 50);   //0..1 -> 0..100 --> -50..50
            array[i] = (int) (Math.random()*1282 - 347);
            System.out.print(array[i] + "\t");
        }
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }

        System.out.println("Min = " + min);

    }
/*
DZ
1. diff postfix and prefix increment (decrement)
 */
}