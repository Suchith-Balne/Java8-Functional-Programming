package com.java.functionalInterfaces;

import com.java.model.Student;
import com.java.model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerMethodReference {

    public static void main(String[] args) {
        //Method reference for default method
        Consumer<Student> c1 = System.out::println;
        StudentDataBase.getAllStudents().forEach(c1);

        System.out.println("Constructor reference:");
        //Constructor Reference
        Supplier<Student> s1 = Student::new;
        System.out.println(s1.get());

        //Constructor reference with function
        Function<String, Student> studentFunction = Student::new;
        System.out.println(studentFunction.apply("Suchith"));

    }

}
