package com.guangp.collection;

import io.vavr.collection.List;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ListTest {
    public static void main(String[] args) {
        // java8
        System.out.println(Arrays.asList(1, 2, 3).stream().reduce((i, j) -> i + j));
        System.out.println(IntStream.of(1, 2, 3).sum());

        // vavr
        System.out.println(List.of(1, 2, 3).sum());
    }
}
