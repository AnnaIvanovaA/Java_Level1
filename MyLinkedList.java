package com.levelup.lesson5;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by aivanova on 15.03.2016.
 */
public class MyLinkedList {
    private Node first, last;
    private int N;


    public class Node {

        Integer item;
        Node next;
        Node prev;

        public Node(Integer item) {
            this.item = item;
            this.next = null;
            this.prev = null;
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
        } else{
            newEntry.next = first;
            first.prev = newEntry;
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
            newEntry.prev = last;
            last = newEntry;
        }
        N++;
    }

    public int removeFirst() {
        int deleted;
        deleted = first.item;

        first = first.next;
        first.prev = null;
        N--;

        return deleted;
    }

    public int removeLast() {
        int deleted;
        deleted = last.item;

        last = last.prev;
        last.next = null;
        N--;

        return deleted;
    }

    // by analogy with standard method add(int index, E element)
    public void insertAfter(int valueAfter, int value){
        Node temp;
        Node newEntry = new Node(value);
        Node entry = first;

        while (entry.item != valueAfter) {
            entry = entry.next;
        }

        temp = entry.next;
        entry.next = newEntry;
        newEntry.next = temp;
        newEntry.prev = entry;
    }

    public int getFirst() {
        return first.item;
    }

    public int getLast() {
        return last.item;
    }

    // indexes are starting from 0
    public int get(int index){
        Node entry = first;
        for (int i = 0; i < index ; i++) {
            entry = entry.next;
        }
        return entry.item;
    }

    public void printAll(){
        for (Node x = first; x != null; x = x.next){
            System.out.println(x.item);
        }
    }

    public void clear(){
        for (Node x = first; x != null; ){
            Node next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        N = 0;
        first = last = null;
    }

}
