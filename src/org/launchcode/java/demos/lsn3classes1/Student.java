package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // getters and setters
    public String getName(){return name;}
    void setName(String aName){name = aName;}

    public int getStudentId(){return studentId;}
    void setStudentId(int aStudentId){studentId = aStudentId;}

    public int getNumberOfCredits(){return numberOfCredits;}
    void setNumberOfCredits(int aNumberOfCredits){numberOfCredits = aNumberOfCredits;}

    public double getGpa(){return gpa;}
    void setGpa(double aGpa){gpa = aGpa;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}