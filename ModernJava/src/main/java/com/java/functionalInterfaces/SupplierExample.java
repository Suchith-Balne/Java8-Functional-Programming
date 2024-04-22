package com.java.functionalInterfaces;

import com.java.model.Student;
import com.java.model.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> student = () -> new Student("Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));

    static Supplier<List<Student>> studentList = StudentDataBase::getAllStudents;

    public static void main(String[] args) {
        System.out.println(student.get());
        System.out.println(studentList.get());
    }
}
