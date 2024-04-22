package com.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = String::toUpperCase;

    static Function<String, String> addSomeString = name -> name.toUpperCase().concat("Balne");

    public static void main(String[] args) {

        // Converts normal string to uppercase
        System.out.println("Result is : " + function.apply("suchith"));

        // First given string is converted to uppercase and then concatenates with the new function addSomeString
        System.out.println("Result of and then is:" + function.andThen(addSomeString).apply("suchith"));

        // First addSomeString is executed first then function is executed
        System.out.println("Result of compose is:" + function.compose(addSomeString).apply("suchith"));
    }
}
