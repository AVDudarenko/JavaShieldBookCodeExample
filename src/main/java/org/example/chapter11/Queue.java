package org.example.chapter11;

public class Queue {
    int n;
    boolean valueSet = false;


    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("catch exception InterruptedException");
            }

        }
        System.out.println("Get: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("catch exception InterruptedException");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Send: " + n);
        notify();
    }
}
