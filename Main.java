package com.levelup.lesson5;

/**
 * Created by Anna on 12.03.2016.
 */
public class Main {

    public static void main(String[] args) {

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random()*100-50);
//        }
//
//        int[] temp = new int[array.length+1];
//        for (int i = 0; i < array.length ; i++) {
//            temp[i] = array[i];
//        }
//        array = temp;
//
//        array[10] = 1000;
//
//        for (int i = 0; i < 11; i++) {
//            System.out.println(array[i]);
//
//        }

        MyArrayList list = new MyArrayList();
        list.add(55);
        list.add(93);
        list.add(34);
        list.add(86);
        list.add(101);

        System.out.println("size " + list.size());

        list.insert(1, 48);


        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        MyStack stack = new MyStack();
        stack.push(89);
        stack.push(89);
        stack.push(89);
        stack.push(89);
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }

        stack.pop();
        System.out.println("");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        stack.push(111);
        System.out.println("");
        System.out.println(stack.peek());


        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

    }
}
