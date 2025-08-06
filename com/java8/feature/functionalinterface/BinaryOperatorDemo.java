package com.java8.feature.functionalinterface;

import java.util.function.BinaryOperator;

/**
 * BinaryOperatorDemo
 * Demonstrates the use of BinaryOperator functional interface in Java 8.
 */
public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 3 and 4: " + add.apply(3, 4));
    }
}
