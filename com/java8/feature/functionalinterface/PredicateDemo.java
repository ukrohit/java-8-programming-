package com.java8.feature.functionalinterface;

import java.util.function.Predicate;

/**
 * PredicateDemo
 * Demonstrates the use of Predicate functional interface in Java 8.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 even? " + isEven.test(5));
    }
}
