package com.java8.feature.methodreference;

import java.util.function.Consumer;

/**
 * StaticMethodReferenceDemo
 * Demonstrates reference to a static method using Java 8 method reference.
 */
public class StaticMethodReferenceDemo {
    public static void printMessage(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Consumer<String> printer = StaticMethodReferenceDemo::printMessage;
        printer.accept("Hello from static method reference!");
    }
}
