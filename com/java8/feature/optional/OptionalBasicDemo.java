package com.java8.feature.optional;

import java.util.Optional;

/**
 * OptionalBasicDemo
 * Demonstrates basic usage of Optional: ofNullable, isPresent, get.
 */
public class OptionalBasicDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("Java");
        if (opt.isPresent()) {
            System.out.println("Value: " + opt.get());
        } else {
            System.out.println("No value present");
        }
    }
}
