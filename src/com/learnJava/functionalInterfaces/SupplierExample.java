package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> StudentDataBase.getAllStudents().get(0);
        System.out.println("Student is : " + studentSupplier.get());

        Supplier<List<Student>> studentListSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println("Students are: " + studentListSupplier.get());
    }
}
