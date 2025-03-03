package org.example.chapter11;

public class PCFixed {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.thread.start();
        consumer.thread.start();

        System.out.println("Enter <Ctrl-C> for stop program");
    }
}
