package com.ironhack.main;
import com.ironhack.classes.Student;
import com.ironhack.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /** Exercise 1 */
        // Creo 4 Students
        Student student1= new Student("Rubén");
        Student student2= new Student("Paul");
        Student student3= new Student("Coby");
        Student student4= new Student("Alejandro");

        // Creo el mapa y añado los Students
        Map<String, Student> students = new HashMap<>();
        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);

        // Foreach para mostrar el nombre y su grado.
        for (String name: students.keySet()) {
            System.out.println("Name: " +name+ ". Grade: " +students.get(name).getGrade());
        }

        /** Exercise 2 */
        System.out.println("Exercise number 2");
        Utils.increaseGrade(students);
    }
}
