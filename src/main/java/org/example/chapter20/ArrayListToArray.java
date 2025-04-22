package org.example.chapter20;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println("Array content: " + arrayList);

        Integer[] integerArray = new Integer[arrayList.size()];
        integerArray = arrayList.toArray(integerArray);
        int sum = 0;

        for (int i : integerArray) {
            sum += i;
        }
        System.out.println("Summ in array:" + sum);
    }
}
