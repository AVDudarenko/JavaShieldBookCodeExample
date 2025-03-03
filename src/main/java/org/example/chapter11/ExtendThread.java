package org.example.chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        NewThreadWithThread newThreadWithThread = new NewThreadWithThread();
        newThreadWithThread.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Ending of main thread");
    }
}
