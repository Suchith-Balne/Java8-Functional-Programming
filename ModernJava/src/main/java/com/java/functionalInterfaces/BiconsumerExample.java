package com.java.functionalInterfaces;

import com.java.model.Student;
import com.java.model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiconsumerExample {
    public static BiConsumer<String, List<String>> biconsumer = (studentName, activities) -> System.out.println(studentName + ":" + activities);

    static void printNameAndActivities(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach( student -> {
            biconsumer.accept(student.getName(), student.getActivities());
        });
    }


    public static void main(String[] args) {
        printNameAndActivities();
    }





}
