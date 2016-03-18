package com.levelup.lesson5;

/**
 * Created by aivanova on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {


//        MyLinkedListOneWay list = new MyLinkedListOneWay();
//        list.addToEnd(1);
//        list.addToEnd(2);
//        list.addToEnd(3);
//        list.addToEnd(4);
//
//        list.addToStart(11);
//        list.addToStart(22);
//        list.addToStart(33);
//        list.addToStart(44);
//
//
//        list.printAll();
//        System.out.println("size " +list.size() );
//
//        int k = list.removeFirst();
//        list.printAll();
//        System.out.println("first was " + k);
//
//        list.removeLast();
//        list.addToStart(165);
//        list.printAll();
//        //System.out.println("last was " + k);
//
//        System.out.println("laaaaaaast " + list.getLast());
//
//        System.out.println("middle ");
//        list.insertInTheMiddle(777);
//        list.printAll();
//
//        list.insertAfter(1, 888);
//        list.printAll();

        MyLinkedList twoWayList = new MyLinkedList();
        twoWayList.addToStart(17);
        twoWayList.addToStart(16);
        twoWayList.addToStart(15);

        twoWayList.addToEnd(25);
        twoWayList.addToEnd(26);
        twoWayList.addToEnd(27);

        twoWayList.removeFirst();
        twoWayList.addToStart(15);

        twoWayList.removeLast();
        twoWayList.addToEnd(27);

        twoWayList.insertAfter(17, 777);
        twoWayList.insertAfter(777, 1666);
        twoWayList.printAll();

        //twoWayList.clearList();
        twoWayList.printAll();

        System.out.println("gettt " +twoWayList.get(3));




    }
}
