package com.learnJava.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /*Legacy java runnable implementation*/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside the Runnable 1");
            }
        };
        new Thread(runnable).start();

        /*Java 8 lambda*/
        new Thread(() -> System.out.println("Inside Runnable 2")).start();

    }
}
