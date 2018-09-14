package com.guangp.collection;

import io.vavr.collection.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream.from(1).filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
