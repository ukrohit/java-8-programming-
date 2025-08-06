package com.java8.feature.functionalinterface;

import java.util.function.Supplier;

/**
 * SupplierDemo
 * Demonstrates the use of Supplier functional interface in Java 8.
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random value: " + randomSupplier.get());
    }
}
