package org.example.chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread newThread1 = new NewThread("One");
        NewThread newThread2 = new NewThread("Two");
        NewThread newThread3 = new NewThread("Three");

        newThread1.thread.start();
        newThread2.thread.start();
        newThread3.thread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread finish");
    }
}
