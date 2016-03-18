package com.levelup.lesson5;

/**
 * Created by aivanova on 14.03.2016.
 */
public class MyLinkedListOneWay {

    private Node first, last;
    private int N;


    public class Node {

        Integer item;
        Node next;

        public Node(Integer item) {
            this.item = item;
            this.next = null;
        }

    }

    public int size(){
        return N;
    }

    public void addToStart(int value) {
        Node newEntry = new Node(value);
        if (first == null){
            first = newEntry;
            last = newEntry;
        } else {
            newEntry.next = first;
            first = newEntry;
        }
        N++;
    }

    public void addToEnd(int value) {
        Node newEntry = new Node(value);
        if (first == null){
            first = newEntry;
            last = newEntry;
        } else {
            last.next = newEntry;
            last = newEntry;
        }
        N++;
    }

    public int removeFirst() {
        int deleted;
        deleted = first.item;
        first = first.next;
        N--;

        return deleted;
    }

    public int removeLast() {
        int deleted;
        deleted = last.item;
        Node prevEntry = new Node(0);

        for (Node x = first; x != last; x = x.next){
            prevEntry = x;
        }
        last = prevEntry;
        last.next = null;
        N--;

        return deleted;
    }

    public void insertInTheMiddle(int value) {
        //int middle = N / 2;
        Node temp;
        Node newEntry = new Node(value);
        Node prevEntry = first;
        int i = 1;
        while (i < N / 2) {
            i++;
            prevEntry = prevEntry.next;
            }
        temp = prevEntry.next;
        prevEntry.next = newEntry;
        newEntry.next = temp;
    }

    public void insertAfter(int valueAfter, int value){
        Node temp;
        Node newEntry = new Node(value);
        Node prevEntry = first;

        while (prevEntry.item != valueAfter) {
            prevEntry = prevEntry.next;
        }
        temp = prevEntry.next;
        prevEntry.next = newEntry;
        newEntry.next = temp;
    }

    public int getLast() {
        return last.item;
    }


    public void printAll(){
        for (Node x = first; x != null; x = x.next){
            System.out.println(x.item);
            //System.out.println(x.next);
        }
    }


}
