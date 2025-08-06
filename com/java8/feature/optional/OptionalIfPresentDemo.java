package com.java8.feature.optional;

import java.util.Optional;

/**
 * OptionalIfPresentDemo
 * Demonstrates using ifPresent for conditional execution.
 */
public class OptionalIfPresentDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("Java");
        opt.ifPresent(val -> System.out.println("Value is present: " + val));
    }
}
