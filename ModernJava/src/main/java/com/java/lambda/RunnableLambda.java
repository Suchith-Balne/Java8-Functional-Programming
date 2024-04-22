package com.java.lambda;

public class RunnableLambda {

    public static void main(String[] args) {

        /*
            Prior to Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

       /*
          Using Java8
        */

        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 2");
        Runnable runnableLambda2 = () -> {System.out.println("Inside Runnable 3");};

        Runnable runnableLambda3 = () -> {
            System.out.println("Inside Runnable 4");
            System.out.println("Inside Runnable 4");
        };



        new Thread(runnableLambda1).start();
        new Thread(runnableLambda2).start();
        new Thread(runnableLambda3).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3");
            }
        }).start();

        new Thread(() -> System.out.println("Inside Runnable 5")).start();


    }
}