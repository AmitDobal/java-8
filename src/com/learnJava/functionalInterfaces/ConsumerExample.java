package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8 features");
//        System.out.println("-----------STUDENTS_______________");
//        printName();
        System.out.println("-----------ACTIVITES--------------");
        printNameAndActivities();
        System.out.println("\n-----------Conditional ACTIVITES--------------");
        printNameAndActivitiesUsingCondition();
    }

    public static void printName() {
        Consumer<Student> studentConsumer = (student) -> System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    static Consumer<Student> c1 = student -> System.out.print(student.getName());
    static Consumer<Student> c2 = student -> System.out.println(student.getActivities());

    public static void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1.andThen(c2));
    }

    public static void printNameAndActivitiesUsingCondition(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel()>=3){
                c1.andThen(c2).accept(student);
            }
        });
    }
}
