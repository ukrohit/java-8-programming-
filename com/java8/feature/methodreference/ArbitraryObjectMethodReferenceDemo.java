package com.java8.feature.methodreference;

import java.util.Arrays;

/**
 * ArbitraryObjectMethodReferenceDemo
 * Demonstrates reference to an instance method of an arbitrary object of a particular type.
 */
public class ArbitraryObjectMethodReferenceDemo {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C++"};
        // Sort using method reference to String's compareToIgnoreCase
        Arrays.sort(arr, String::compareToIgnoreCase);
        // Print using method reference to println
        Arrays.stream(arr).forEach(System.out::println);
    }
}
