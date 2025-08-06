package com.java8.feature.optional;

import java.util.Optional;

/**
 * OptionalOrElseDemo
 * Demonstrates using orElse and orElseGet for default values.
 */
public class OptionalOrElseDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.orElse("Default Value"));
        System.out.println(opt.orElseGet(() -> "Generated Default"));
    }
}
