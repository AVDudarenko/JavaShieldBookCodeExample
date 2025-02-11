package org.example.chapter4;

public class ChapterFour {

    public static void arithmeticOperations() {

        System.out.println("Integers: ");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);
        System.out.println("e= " + e);

        System.out.println("\nArithmetic with dot");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

    }

    public static void divideByModule() {
        int x = 42;
        double y = 42.25;

        System.out.println("x by module 10 = " + x % 10);
        System.out.println("y by module 10 = " + y % 10);
    }

    public static void opEquals() {
        int a = 1, b = 2, c = 3;

        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
