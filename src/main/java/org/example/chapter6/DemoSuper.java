package org.example.chapter6;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight boxWeight1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight boxWeight2 = new BoxWeight();
        BoxWeight boxWeight3 = new BoxWeight(10, 20);
        BoxWeight boxWeight4 = new BoxWeight(boxWeight1);
        double vol;

        vol = boxWeight1.volume();
        System.out.println("Volume of boxWeight1 " + vol);
        System.out.println("Weight of boxWeight1 " + boxWeight1.weight);
        System.out.println();

        vol = boxWeight2.volume();
        System.out.println("Volume of boxWeight1 " + vol);
        System.out.println("Weight of boxWeight1 " + boxWeight2.weight);
        System.out.println();

        vol = boxWeight3.volume();
        System.out.println("Volume of boxWeight1 " + vol);
        System.out.println("Weight of boxWeight1 " + boxWeight3.weight);
        System.out.println();

        vol = boxWeight4.volume();
        System.out.println("Volume of boxWeight1 " + vol);
        System.out.println("Weight of boxWeight1 " + boxWeight4.weight);
        System.out.println();
    }
}
