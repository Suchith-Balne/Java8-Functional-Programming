package com.java.functionalInterfaces;

import com.java.model.Student;
import com.java.model.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionalInterfaceStudentExample {

    //This functional interface takes List of students as input and returns Map of String and double as output
    static Function<List<Student>, Map<String, Double>> studentFunction = (studentList -> {

        Map<String, Double> studentGrade = new HashMap<>();

        studentList.forEach( (student -> {
            if(PredicateStudentExample.p1.test(student))
                studentGrade.put(student.getName(), student.getGpa());
                }));
        return studentGrade;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
