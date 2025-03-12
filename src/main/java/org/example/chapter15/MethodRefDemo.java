package org.example.chapter15;

public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inString = "Lambdas add power to Java";
        String outString;

        outString = stringOp(MyStringOps::strReverse, inString);

        System.out.println("Source string: " + inString);
        System.out.println("String with reverse order: " + outString);
    }
}
