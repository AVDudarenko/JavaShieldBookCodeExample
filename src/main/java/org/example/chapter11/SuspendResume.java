package org.example.chapter11;

public class SuspendResume {
    public static void main(String[] args) {
        NewThreadStartStop newThreadStartStop1 = new NewThreadStartStop("one");
        NewThreadStartStop newThreadStartStop2 = new NewThreadStartStop("two");
        newThreadStartStop1.thread.start();
        newThreadStartStop2.thread.start();
        try {
            Thread.sleep(1000);
            newThreadStartStop1.mysuspend();
            System.out.println("Pause thread one");
            Thread.sleep(1000);
            newThreadStartStop1.myresume();
            System.out.println("Resume thread one");
            newThreadStartStop2.mysuspend();
            System.out.println("Pause thread two");
            Thread.sleep(1000);
            newThreadStartStop2.myresume();
            System.out.println("Resume thread two");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        try {
            System.out.println("Wait threads ending");
            newThreadStartStop1.thread.join();
            newThreadStartStop2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("main thread ended");
    }
}
