package com.java.functionalInterfaces;

import com.java.model.Student;
import com.java.model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {

    // For filtering students whose gradelevel is greater than 3
    static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;

    // For filtering students whose gpa is greater than 3.9
    static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;

    //To print name and activities of student
    // Here, input is of type string an output is of type List<String>
    static BiConsumer<String, List<String>> studentBiconsumer = (name, activities)
            -> System.out.println(name + ":" + activities);

    // Using consumer and predicate
    static Consumer<Student> studentConsumer = s -> {
        if (p1.and(p2).test(s)) {
                studentBiconsumer.accept(s.getName(), s.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> student){
        student.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumer().printNameAndActivities(studentList);
    }
}
