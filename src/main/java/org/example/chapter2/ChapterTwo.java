package org.example.chapter2;

public class ChapterTwo {

    public static void printSum() {
        int num;
        num = 100;

        System.out.println("Count of num: " + num);

        num = num * 2;

        System.out.println("Count of num*2: " + num);
        System.out.println(num);
    }

    public static void ifSample() {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x less than y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x equals y");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("x more than y");
        }

        if (x == y) {
            System.out.println("you never see this");
        }
    }

    public static void forTest() {
        int x;
        for (x = 0; x < 10; x++) {
            System.out.println("Value x = " + x);
        }
    }

    public static void blockTest() {
        int x, y;
        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("Count of x = " + x);
            System.out.println("Count of y = " + y);

            y = y - 2;
        }
    }

}
