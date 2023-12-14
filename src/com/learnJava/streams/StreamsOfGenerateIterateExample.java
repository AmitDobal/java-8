package com.learnJava.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

    public static void main(String[] args) {

        //OF
        Stream<String> stringStream = Stream.of("adam", "dan", "julie");
        stringStream.forEach(System.out::println);

        //ITERATE
        Stream.iterate(1, x -> x * 2)
                .limit(30)
                .forEach(System.out::println);

        //GENERATE
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);

    }


}
