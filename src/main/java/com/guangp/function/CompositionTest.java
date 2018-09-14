package com.guangp.function;

import io.vavr.Function1;

public class CompositionTest {
    public static void main(String[] args) {
        Function1<Integer, Integer> plusOne = a -> a + 1;
        Function1<Integer, Integer> multiplyByTwo = a -> a * 2;
        Function1<Integer, Integer> add1AndMultiplyBy2 = plusOne.andThen(multiplyByTwo);

        System.out.println(add1AndMultiplyBy2.apply(2));

        System.out.println(multiplyByTwo.compose(plusOne).apply(2));
    }
}
