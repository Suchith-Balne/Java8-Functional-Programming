package com.java.functionalInterfaces;

import com.java.model.Student;
import com.java.model.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGpa()>=4;
    static Predicate<Student> p2 = (s) -> s.getGradeLevel()>=3;

    public static void filterStudentByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(s1 -> {
            if(p2.test(s1)){
                System.out.println(s1);
            }
        });
    }

    public static void filterStudentByGpa(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(s1 -> {
            if(p1.test(s1)){
                System.out.println(s1);
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Filtered Students by grade level more then 3:");
        filterStudentByGradeLevel();
        System.out.println("\nFiltered Students by gpa more then 4:");
        filterStudentByGpa();
    }
}
