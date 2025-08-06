package com.java8.feature.optional;

import java.util.Optional;

/**
 * OptionalOrElseThrowDemo
 * Demonstrates using orElseThrow for exception handling.
 */
public class OptionalOrElseThrowDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);
        try {
            String value = opt.orElseThrow(() -> new RuntimeException("No value present"));
            System.out.println(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
