package org.example.chapter15;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b){
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(2));
        al.add(new MyClass(3));
        al.add(new MyClass(4));
        al.add(new MyClass(5));
        al.add(new MyClass(6));

        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Max value equals: "+ maxValObj.getVal());
    }
}
