package com.java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryUnary {

    static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;

    static UnaryOperator<String> concatString = (s)->  s.concat("Balne");

    static Comparator<Integer> comparator = Integer::compareTo;

    public static void main(String[] args) {
        System.out.println(concatString.apply("Suchith"));
        System.out.println(binaryOperator.apply(4,3));
        System.out.println(BinaryOperator.maxBy(comparator).apply(4,3));
        System.out.println(BinaryOperator.minBy(comparator).apply(10,20));
    }
}
