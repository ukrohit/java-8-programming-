package com.java8.feature.methodreference;

import java.util.function.Supplier;

/**
 * ConstructorReferenceDemo
 * Demonstrates reference to a constructor using Java 8 method reference.
 */
class Message {
    Message() {
        System.out.println("Message object created!");
    }
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        Supplier<Message> messageSupplier = Message::new;
        messageSupplier.get(); // Creates a new Message object
    }
}
