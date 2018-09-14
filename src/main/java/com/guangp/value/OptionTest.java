package com.guangp.value;

import io.vavr.control.Option;

public class OptionTest {
    public static void main(String[] args) {
        /*Optional<String> maybeFoo = Optional.of("foo");
        System.out.println((maybeFoo.get()).equals("foo"));
        Optional<String> maybeFooBar = maybeFoo.map(s -> (String)null)
                .map(s -> s.toUpperCase() + "bar");
        System.out.println(maybeFooBar.isPresent());*/

        Option<String> maybeFoo = Option.of("foo");
        System.out.println((maybeFoo.get()).equals("foo"));
        Option<String> maybeFooBar = maybeFoo.map(s -> (String)null)
                .flatMap(s -> Option.of(s)
                        .map(t -> t.toUpperCase() + "bar"));
        System.out.println(maybeFooBar.isEmpty());
    }
}
