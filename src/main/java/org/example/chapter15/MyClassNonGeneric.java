package org.example.chapter15;

public class MyClassNonGeneric {

    String string;

    MyClassNonGeneric(String s) {
        string = s;
    }

    MyClassNonGeneric() {
        string = "";
    }

    String getVal() {
        return string;
    }

}
