package com.java8.feature.methodreference;

import java.util.function.Consumer;

/**
 * InstanceMethodReferenceDemo
 * Demonstrates reference to an instance method of a particular object.
 */
public class InstanceMethodReferenceDemo {
    public void print(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        InstanceMethodReferenceDemo demo = new InstanceMethodReferenceDemo();
        Consumer<String> printer = demo::print;
        printer.accept("Hello from instance method reference!");
    }
}
