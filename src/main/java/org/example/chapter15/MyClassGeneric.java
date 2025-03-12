package org.example.chapter15;

public class MyClassGeneric<T> {
    private T val;

    MyClassGeneric(T v) {
        val = v;
    }

    MyClassGeneric() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
