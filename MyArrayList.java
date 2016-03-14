package com.levelup.lesson5;

/**
 * Created by Anna on 12.03.2016.
 */
public class MyArrayList {

    int[] values;

    //to the end
    public void add(int value) {
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
            System.err.println("Error: ArrayList is empty");
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

    // удалить и вернуть удалённый элемент
    public int remove(int index) {
        if (values == null){
            System.err.println("Error: ArrayList is empty");
            return 0;
        }
        int[] temp = new int[values.length-1];
        int removedElement = 0;
        for (int i = 0; i < values.length  ; i++) {
            if (i < index){
                temp[i] = values[i];
            } else if (i > index){
                temp[i-1] = values[i];
            } else {
                removedElement = values[index];
            }
        }
        values = temp;
        return removedElement;

    }

    // вставить и сдвинуть
    public void insert(int index, int value) {

        if (values == null){
            System.err.println("Error: ArrayList is empty");
        }

        int[] temp = new int[values.length+1];
        for (int i = 0; i <= values.length ; i++) {
            if (i < index){
                temp[i] = values[i];
            } else if (i > index){
                temp[i] = values[i-1];
            } else {
                temp[i] = value;

            }
        }
        values = temp;
    }

    public void clear() {
        int[] temp = new int[1];
        values = temp;
    }
}
