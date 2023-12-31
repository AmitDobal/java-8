package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a: " + a + " b: " + b);
        biConsumer.accept("Java7", "Java8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication: " + a*b);
        BiConsumer<Integer, Integer> divide = (a, b) -> System.out.println("Division: " + a/b);

        multiply.andThen(divide).accept(10,5);
        printNameAndActivities();

    }
    public static void printNameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }
}
