package org.example.chapter15;

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFuncFabric<R, T> con, T v) {
        return con.func(v);
    }

    public static void main(String[] args) {
        MyFuncFabric<MyClassGeneric<Double>, Double> myClassCons = MyClassGeneric<Double>::new;

        MyClassGeneric<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("val in mc equals " + mc.getVal());
    }
}
