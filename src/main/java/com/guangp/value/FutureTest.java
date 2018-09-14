package com.guangp.value;

import io.vavr.concurrent.Future;

public class FutureTest {
    public static void main(String[] args) {
        Future<Integer> future = Future.of(() -> 1 + 1).onComplete(i -> System.out.println("get value " + i));
        System.out.println(future);
    }
}
