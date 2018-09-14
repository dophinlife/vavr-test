package com.guangp.function;

import io.vavr.Function2;

public class FunctionTest {
    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(1,2));
    }
}
