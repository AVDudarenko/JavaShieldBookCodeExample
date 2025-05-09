package org.example.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current thread: " + thread);
        thread.setName("My Thread");
        System.out.println("After changing name: " + thread);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread are stoped");
        }
    }
}
