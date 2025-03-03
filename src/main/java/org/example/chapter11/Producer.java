package org.example.chapter11;

public class Producer implements Runnable {
    Queue queue;
    Thread thread;

    Producer(Queue queue) {
        this.queue = queue;
        thread = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queue.put(i++);
        }
    }
}
