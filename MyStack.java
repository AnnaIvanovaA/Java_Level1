package com.levelup.lesson5;

/**
 * Created by Anna on 12.03.2016.
 */
public class MyStack {

    int[] values;

//    - должны быть методы:
//    pop() - удаляет верхний элемент из стека (последний добавленный)
//    и возвращает его
//    peek()- возвращает верхний элемент
//    push()- кладет элемент в вершину стека
//    size()
//    clear()

    public int pop(){
        if (values == null){
            System.err.println("Error: Stack is empty");
            return 0;
        }
        int[] temp = new int[values.length-1];
        int deletedElement = 0;
        for (int i = 0; i < values.length - 1  ; i++) {
           temp[i] = values[i];
        }
        deletedElement = values[values.length-1];
        values = temp;
        return deletedElement;
    }

    public int peek() {
        if (values == null){
            System.err.println("Error: Stack is empty");
            return 0;
        }
        return values[values.length-1];
    }

    public void push(int value) {
        if (values == null){
            values = new int[1];
            values[0] = value;
        } else {
            int[] temp = new int[values.length+1];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            temp[temp.length-1] = value;
            values = temp;
        }

    }

    public int get(int index) {
        if (values == null){
            System.err.println("Error: Stack is empty");
            return 0;
        }
        return values[index];
    }

    public int size(){
        if (values == null){
            return 0;
        }
        return values.length;
    }

    public void clear() {
        int[] temp = new int[1];
        values = temp;
    }

}
