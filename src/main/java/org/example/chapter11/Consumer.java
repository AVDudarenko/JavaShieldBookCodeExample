package org.example.chapter11;

public class Consumer implements Runnable {
    Queue queue;
    Thread thread;

    Consumer(Queue queue) {
        this.queue = queue;
        thread = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        while (true){
            queue.get();
        }
    }
}
