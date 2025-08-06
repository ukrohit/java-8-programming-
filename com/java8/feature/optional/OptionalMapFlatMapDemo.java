package com.java8.feature.optional;

import java.util.Optional;

/**
 * OptionalMapFlatMapDemo
 * Demonstrates chaining with map and flatMap.
 */
public class OptionalMapFlatMapDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Java");
        Optional<Integer> length = opt.map(String::length);
        System.out.println("Length: " + length.orElse(0));

        Optional<String> upper = opt.flatMap(val -> Optional.of(val.toUpperCase()));
        System.out.println("Uppercase: " + upper.orElse(""));
    }
}
