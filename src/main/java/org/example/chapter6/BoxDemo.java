package org.example.chapter6;

public class BoxDemo extends Box {

    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 10);
        Box myBox2 = myBox;
        double vol;

        vol = myBox.volume();

        System.out.println("Vol equals: " + vol);
        System.out.println("myBox2 " + myBox2);
        myBox = null;
        System.out.println("myBox " + myBox);
        System.out.println("myBox2 " + myBox2);
    }


}
