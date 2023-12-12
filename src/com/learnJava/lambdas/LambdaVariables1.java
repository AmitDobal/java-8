package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariables1 {
    public static void main(String[] args) {
        int i = 12;
        Consumer<Integer> c1 = i1 -> {
            System.out.println("Value is: " + i);
        };
    }
}
