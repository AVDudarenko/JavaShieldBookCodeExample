package org.example.chapter3;

public class ChapterThree {

    int[] month_days = {31, 28, 31, 30, 31};
    double[] nums = {10.1, 11.2, 13.3, 12.3, 14.5};

    private void printDays() {
        System.out.println(month_days[1]);
    }

    public void findMiddle() {
        double result = 0;
        int i;

        for (i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("findMiddle: " + result / 5);
        }
    }

}
