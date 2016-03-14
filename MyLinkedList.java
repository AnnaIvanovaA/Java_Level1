package com.levelup.lesson5;

/**
 * Created by Anna on 12.03.2016.
 */
public class MyLinkedList {

    private class Node {
        Integer item;
        Node next;
    }
    private Node first, last;
    private int N;

    Node node = new Node();

    public int size(){
        return N;
    }
    public void add(int value) {
        Node oldFirstNode = first;
        first.item = value;
        first.next = oldFirstNode;
        N++;
    }

    public MyLinkedList get(){
        for (Node x = fisrt; x != null; x = x.next){

        }
    }
}
