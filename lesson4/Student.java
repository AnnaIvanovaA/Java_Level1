package com.levelup.lesson4;

/**
 * Created by Anna on 09.03.2016.
 */
public class Student {

    String name;
    int age;
    boolean isFullTime; //camel case
    double avr;

    public void print(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Full time " + isFullTime);
        System.out.println("Average " + avr);

    }
}
