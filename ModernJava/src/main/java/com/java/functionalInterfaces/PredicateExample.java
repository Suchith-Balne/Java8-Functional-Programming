package com.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

        //Predicate is used to check whether the condition is satisfied or not.
        static Predicate<Integer> p1 = i -> i % 10 == 0;

        static Predicate<Integer> p2 = i -> i % 5 == 0;

        public static void predicateAnd(){
            System.out.println("Predicate and p1, p2: " + p1.and(p2).test(10));
        }

    public static void predicateOr(){
        System.out.println("Predicate or p1, p2: " + p1.or(p2).test(10));
        System.out.println("Predicate or negate p1, p2: " + p1.or(p2).negate().test(10));
    }

    public static void predicateOrNegate(){
        System.out.println("Predicate or negate p1, p2: " + p1.or(p2).negate().test(10));
    }

    public static void main(String[] args) {
        predicateAnd();
        predicateOr();
        predicateOrNegate();
    }



}
