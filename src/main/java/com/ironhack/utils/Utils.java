package com.ironhack.utils;
import com.ironhack.classes.Student;
import java.util.Map;

/** Exercise 2: Create a method that takes a Map<String, Student> as a paremeter,
 * increase every students grade by 10%, and returns the Map.*/

public class Utils {

    public static Map<String, Student>  increaseGrade (Map<String, Student> students) {
        for (String name: students.keySet()) {
            Student student1 = students.get(name);
            student1.setGrade(((int) (student1.getGrade()*1.1)));
            System.out.println("Name: " +name+ ". Grade: " +students.get(name).getGrade());
        }
        return students;
    }

//    public static Map<String, Student> increaseGradeStream (Map<String, Student> students) {
//        students.values().stream().map(student -> student.setGrade(1));
//    }
}
