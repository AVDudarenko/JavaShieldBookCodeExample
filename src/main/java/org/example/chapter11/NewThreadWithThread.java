package org.example.chapter11;

public class NewThreadWithThread extends Thread {

    NewThreadWithThread() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Ending of child thread");
    }
}
