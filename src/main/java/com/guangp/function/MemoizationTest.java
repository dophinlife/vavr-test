package com.guangp.function;

import io.vavr.Function0;

public class MemoizationTest {
    public static void main(String[] args) {
        Function0<Double> hashCache = Function0.of(Math::random).memoized();
        System.out.println(hashCache.apply());
        System.out.println(hashCache.apply());
    }
}
