package org.example.chapter15;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (string) -> {
            StringBuilder result = new StringBuilder();
            int i;
            for (i = string.length() - 1; i >= 0; i--) {
                result.append(string.charAt(i));
            }
            return result.toString();
        };
        System.out.println("String Lambda with reverse order of chars: " + reverse.func("Lambda"));
        System.out.println("String Expression with reverse order of chars: " + reverse.func("Expression"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Factorial of 3 equals " + factorial.func(3));
        System.out.println("Factorial of 4 equals " + factorial.func(4));
        System.out.println("Factorial of 5 equals " + factorial.func(5));
    }
}
