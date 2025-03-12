package org.example.chapter15;

public class InstanceMethWithObjectRefDemo {

    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(92),
                new HighTemp(45), new HighTemp(57),
                new HighTemp(67), new HighTemp(44),
                new HighTemp(99), new HighTemp(88),
                new HighTemp(91)};

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Count of days, when high temp was equals 89: " + count);

        count = counter(weekDayHighs, HighTemp::upperThanTemp, new HighTemp(89));
        System.out.println("Count of days, when high temp was upper than 89: " + count);

        HighTemp[] weekDayHighs2 = {new HighTemp(32), new HighTemp(3),
                new HighTemp(45), new HighTemp(22),
                new HighTemp(28), new HighTemp(12),
                new HighTemp(45), new HighTemp(13),
                new HighTemp(34)};

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Count of days, when high temp was equals 12: " + count);

        count = counter(weekDayHighs2, HighTemp::upperThanTemp, new HighTemp(12));
        System.out.println("Count of days, when high temp was upper than 12: " + count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Count of days, when high temp was lower than 89: " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(12));
        System.out.println("Count of days, when high temp was lower than 12: " + count);
    }
}
