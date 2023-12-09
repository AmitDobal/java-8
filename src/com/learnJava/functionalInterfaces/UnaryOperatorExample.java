package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /* Both input and output of same Data type. Here it is String */
        UnaryOperator<String> stringUnaryOperator = s -> s.concat("default");
        System.out.println(stringUnaryOperator.apply("java8"));
    }
}
