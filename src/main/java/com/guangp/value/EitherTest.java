package com.guangp.value;

import io.vavr.control.Either;

public class EitherTest {
    static Either<String, Integer> compute(boolean right) {
        if (right)
            return Either.right(1);
        else
            return Either.left("there is an error");
    }
    public static void main(String[] args) {
        Either<String,Integer> value = compute(true).right().map(i -> i * 2).toEither();
        System.out.println(value.get());
    }
}
