package org.example.chapter14;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5, 6};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("average value of iob = " + v);

        Double[] dums = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        Stats<Double> dob = new Stats<>(dums);
        double w = dob.average();
        System.out.println("average value of dob = " + w);

        System.out.println("average value of dob and iob");
        if (iob.isSameAvg(dob)) {
            System.out.println("the same");
        } else {
            System.out.println("not the same");
        }
    }
}
