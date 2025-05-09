package org.example.chapter11;

public class NewThreadStartStop implements Runnable {
    String name;
    Thread thread;
    boolean suspendFlag;

    NewThreadStartStop(String threadName) {
        this.name = threadName;
        thread = new Thread(this, name);
        System.out.println("New thread: " + thread);
        suspendFlag = false;
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + "interrupted");
        }
        System.out.println(name + " stop");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
