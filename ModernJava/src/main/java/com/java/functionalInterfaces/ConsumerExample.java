package com.java.functionalInterfaces;

import com.java.model.Student;
import com.java.model.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
        static Consumer<Student> c2 = student -> System.out.println(student);
        static Consumer<Student> c3 = student -> System.out.print(student.getName());
        static Consumer<Student> c4 = student -> System.out.println(student.getActivities());

    public static void printStudents(){
        System.out.println("\nprintStudents:");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printStudentNameAndActivities(){
        System.out.println("\nprintStudentNameAndActivities:");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
    }

    public static void printStudentNameAndActivitiesUsingCondition(){
        System.out.println("\nprintStudentNameAndActivitiesUsingCondition:");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa()>3.9){
                c3.andThen(c4).accept(student);
            }
        });
    }


    public static void main(String[] args) {

        //Consumer
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());

        c1.accept("java");

        printStudents();

        printStudentNameAndActivities();

        printStudentNameAndActivitiesUsingCondition();


    }
}


