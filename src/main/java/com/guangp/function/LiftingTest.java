package com.guangp.function;

import io.vavr.Function2;
import io.vavr.control.Option;

public class LiftingTest {
    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> divide = (a, b) -> a / b;
        Function2<Integer, Integer, Option<Integer>> safeDivide = Function2.lift(divide);
        Option<Integer> i1 = safeDivide.apply(1, 0);
        System.out.println(i1);
        Option<Integer> i2 = safeDivide.apply(4, 2);
        System.out.println(i2);

        LiftingTest liftingTest = new LiftingTest();
        System.out.println(liftingTest.sum.apply(-1, 2));
        System.out.println(liftingTest.sum(-1, 2));
    }

    int sum(int first, int second) {
        if (first < 0 || second < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        return first + second;
    }

    Function2<Integer, Integer, Option<Integer>> sum = Function2.lift(this::sum);
}
