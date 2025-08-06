package com.java8.feature.functionalinterface;

import java.util.function.UnaryOperator;

/**
 * UnaryOperatorDemo
 * Demonstrates the use of UnaryOperator functional interface in Java 8.
 */
public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println("Square of 5: " + square.apply(5));
    }
}
