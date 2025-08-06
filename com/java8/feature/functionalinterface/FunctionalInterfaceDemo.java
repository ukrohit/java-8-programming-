package com.java8.feature.functionalinterface;

@FunctionalInterface
interface MyFunc {
    int operation(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        MyFunc add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operation(5, 3));
    }
}
