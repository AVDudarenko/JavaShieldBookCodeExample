package org.example.chapter15;

public class LambdaAsArgumentsDemo {
    static String stringOp(StringFunc stringFunc, String string) {
        return stringFunc.func(string);
    }

    public static void main(String[] args) {
        String inString = "Lambdas add power to Java";
        String outString;

        System.out.println("Source string " + inString);

        outString = stringOp((string) -> string.toUpperCase(), inString);
        System.out.println("String in upper case: " + outString);

        outString = stringOp((string) -> {
            String result = "";
            int i;

            for (i = 0; i < string.length(); i++) {
                if (string.charAt(i) != ' ') {
                    result += string.charAt(i);
                }
            }
            return result;
        }, inString);

        System.out.println("String after removing spaces: " + outString);

        StringFunc reverse = (string) -> {
            String result = "";
            int i;
            for (i = string.length() - 1; i >= 0; i--) {
                result += string.charAt(i);
            }
            return result;
        };

        System.out.println("String in reverse order: "+stringOp(reverse, inString));
    }
}
