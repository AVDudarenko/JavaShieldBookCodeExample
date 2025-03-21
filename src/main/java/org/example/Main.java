package org.example;

import org.example.chapter2.ChapterTwo;
import org.example.chapter3.ChapterThree;
import org.example.chapter4.ChapterFour;
import org.example.chapter5.ChapterFive;

public class Main {
    public static void main(String[] args) {

        ChapterTwo.printSum();
        System.out.println("--------------------------------------------");
        ChapterTwo.ifSample();
        System.out.println("--------------------------------------------");
        ChapterTwo.forTest();
        System.out.println("--------------------------------------------");
        ChapterTwo.blockTest();
        System.out.println("--------------------------------------------");
        ChapterThree chapterThree = new ChapterThree();
        chapterThree.findMiddle();
        System.out.println("--------------------------------------------");
        ChapterFour.arithmeticOperations();
        System.out.println("--------------------------------------------");
        ChapterFour.divideByModule();
        System.out.println("--------------------------------------------");
        ChapterFour.opEquals();
        System.out.println("--------------------------------------------");
        ChapterFive.nestingSwitch();
        System.out.println("--------------------------------------------");
        ChapterFive.forEach();
        System.out.println("--------------------------------------------");
        ChapterFive.forEach2();
    }
}