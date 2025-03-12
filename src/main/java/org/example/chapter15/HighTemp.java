package org.example.chapter15;

public class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }

    boolean upperThanTemp(HighTemp ht2) {
        return hTemp > ht2.hTemp;
    }
}
