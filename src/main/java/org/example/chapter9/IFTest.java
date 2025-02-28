package org.example.chapter9;

public class IFTest {
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            fixedStack1.push(i);
        }
        for (int i = 5; i < 13; i++) {
            fixedStack2.push(i);
        }

        System.out.println("Stack in fixedStack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(fixedStack1.pop());
        }

        System.out.println("Stack in fixedStack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(fixedStack2.pop());
        }
    }
}
