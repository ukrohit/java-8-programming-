package com.java8.feature.methodreference;

import java.util.Arrays;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C++"};
        Arrays.sort(arr, String::compareToIgnoreCase);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
