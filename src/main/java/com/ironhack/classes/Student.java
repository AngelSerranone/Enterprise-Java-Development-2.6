package com.ironhack.classes;

import java.util.Random;

/** Exercise 1 : Create Student class with name and grade (this is an int in the range 0-100),
 * then create Student objects for 4 of your classmates. create a Map with a key of student name and a value of a Student object.
 */
public class Student {
    // Properties
    private String name;
    private int grade;

    // Constructor
    public Student(String name) {
        setName(name);
        setRandomGrade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // To set random grade
    public void setRandomGrade() {
        Random random = new Random();
        this.grade = random.nextInt(100);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
