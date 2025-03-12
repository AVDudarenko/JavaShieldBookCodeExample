package org.example.chapter15;

public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array is empty");
    }
}
