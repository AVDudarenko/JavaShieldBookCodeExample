package org.example.chapter15;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {

        StringFunc reverse = (string) -> {
            StringBuilder result = new StringBuilder();
            int i;

            for (i = string.length() - 1; i >= 0; i--) {
                result.append(string.charAt(i));
            }
            return result.toString();
        };

        System.out.println("String Lambda with revers chars: " + reverse.func("Lambda"));
        System.out.println("String Expression with revers chars: " + reverse.func("Expression"));

    }
}
