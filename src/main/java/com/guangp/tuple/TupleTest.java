package com.guangp.tuple;

import io.vavr.Tuple;
import io.vavr.Tuple2;

public class TupleTest {
    public static void main(String[] args) {
        Tuple2<String, Integer> java8 = Tuple.of("Java", 8);
        System.out.println(java8);
        String s = java8._1;
        Integer i = java8._2;
        System.out.println(s);
        System.out.println(i);
        Tuple2<String, Integer> that = java8.map(
                (t, j) -> Tuple.of(t.substring(2) + "vr", j / 8)
        );
        System.out.println(that);
        String str = java8.apply(
                (ss, ii) -> ss.substring(2) + "vr " + ii / 8
        );
        System.out.println(str);

    }
}
