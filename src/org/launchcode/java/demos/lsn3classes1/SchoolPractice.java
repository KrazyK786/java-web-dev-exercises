package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student kris = new Student();
        kris.setName("Kris");
        kris.setGpa(4.0);
        kris.setNumberOfCredits(1);

        System.out.println(kris);

        Student rachelle = new Student();
        rachelle.setGpa(2.5);
        rachelle.setName("Rocky");
        rachelle.setNumberOfCredits(0);

        ArrayList<Student> classRoster = new ArrayList<>();
        classRoster.addAll(Arrays.asList(kris,rachelle));
        Course java101 = new Course();
        java101.setRoster(classRoster);
        java101.setProfessor("Shivany Shenoy");
        java101.setCourseName("Java 101");
        java101.setCreditValue(3);

        System.out.println(java101);
    }
}
