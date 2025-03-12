package org.example.chapter15;

public class MyStringOps {
    static String strReverse(String string) {
        String result = "";
        int i;

        for (i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result;
    }
}
