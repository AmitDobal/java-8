package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariables2 {
    static int k = 2;
    static int l = 2;
    public static void main(String[] args) {
        int value = 4;

        Consumer<Integer> c1 = i -> {
            k = 2;
            System.out.println( value + i);
            System.out.println(k);
        };

        c1.accept(4);
    }

    public void kk(){
        int value = 4;

        Consumer<Integer> c1 = i -> {
            l = 2;
            k =3;

            System.out.println( value + i);
            System.out.println(k);
        };
//        value = 3; //This line will give compilation issue;
        c1.accept(4);
    }
}
