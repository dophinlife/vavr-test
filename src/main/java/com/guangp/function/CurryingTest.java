package com.guangp.function;

import io.vavr.Function1;
import io.vavr.Function2;

public class CurryingTest {
    public static void main(String[] args) {
        Function2<Integer, Integer, Float> sum = (a, b) -> (float)a / b;
        Function1<Integer, Float> add2 = sum.curried().apply(2);
        System.out.println(add2.apply(4));
    }
}
