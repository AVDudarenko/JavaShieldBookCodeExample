package org.example.chapter11;

public class NewThread implements Runnable {
    String name;
    Thread thread;

    NewThread(String threadName) {
        name = threadName;
        thread = new Thread(this, name);
        System.out.println("Child thread: " + thread);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + ": thread interrupted");
        }
        System.out.println(name + ": Ending");
    }
}
