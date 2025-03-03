package org.example.chapter11;

public class NewThread implements Runnable {
    Thread thread;

    NewThread() {
        thread = new Thread(this, "Demo thread");
        System.out.println("Child thread: " + thread);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + thread);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Ending of child thread");
    }
}
