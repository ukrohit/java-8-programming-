package com.java8.feature.optional;

import java.util.Optional;

/**
 * OptionalFilterDemo
 * Demonstrates filtering with Optional's filter method.
 */
public class OptionalFilterDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Java");
        Optional<String> filtered = opt.filter(val -> val.startsWith("J"));
        System.out.println("Filtered value: " + filtered.orElse("No match"));
    }
}
