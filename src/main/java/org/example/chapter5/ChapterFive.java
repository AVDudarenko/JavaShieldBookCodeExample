package org.example.chapter5;

public class ChapterFive {

    public static void nestingSwitch() {
        var count = 1;
        var target = 0;

        switch (count) {
            case 1:
                switch (target) {
                    case 0:
                        System.out.println("target equals zero");
                        break;
                    case 1:
                        System.out.println("target equals one");
                        break;
                }
                break;
        }
    }

    public static void forEach() {
        int[] numArray = {1, 2, 3, 4, 6, 7, 98, 100, 342, 423, 343, 63, 123, 3};
        int sum = 0;

        for (int x : numArray) {
            System.out.println("Value: " + x);
            sum += x;
        }

        System.out.println(sum);
    }

    public static void forEach2() {
        int[] arrayOfNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;

        for (int x : arrayOfNums) {
            System.out.println("Value: " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println(sum);
    }

}
