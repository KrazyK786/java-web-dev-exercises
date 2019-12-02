package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    /**
     * Course
     * -roster private arraylist of student objects
     * -creditValue private int
     * -courseName private string
     * -professor private string
     */
    ArrayList<Student> roster = new ArrayList<>();
    int creditValue = 0;
    String courseName;
    String professor;

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

    public int getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "roster=" + roster +
                ", creditValue=" + creditValue +
                ", courseName='" + courseName + '\'' +
                ", professor='" + professor + '\'' +
                '}';
    }
}
