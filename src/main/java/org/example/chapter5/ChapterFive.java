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

}
