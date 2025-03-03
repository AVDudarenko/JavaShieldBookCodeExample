package org.example.chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.thread.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Stop main thread");
    }
}
