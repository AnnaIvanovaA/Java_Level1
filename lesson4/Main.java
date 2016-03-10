package com.levelup.lesson4;

/**
 * Created by Anna on 09.03.2016.
 */
public class Main {
    public static void main(String[] args){

        Student student1 = new Student();
        student1.name = "Vasya";
        student1.age = 20;
        student1.isFullTime = true;
        student1.avr = 4.8;

        student1.print();

        final double NUMBER_OF_STUDENTS = 10;

        Math.sqrt(64);

        MyMath math = new MyMath();
        math.min(3, 6);
    }
}
