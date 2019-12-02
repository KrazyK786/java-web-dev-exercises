package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        int creds = this.numberOfCredits;
        // Determine the grade level of the student based on numberOfCredits
        /*Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)*/
        if (creds <= 29){
            return "Freshman";
        }
        else if (creds <= 59){
            return "Sophomore";
        }
        else if (creds <= 89){
            return "Junior";
        }
        else{
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double classQualityScore = grade * courseCredits;
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;
        double newTotalQualityScore = currentTotalQualityScore + classQualityScore;
        this.numberOfCredits += courseCredits;
        this.gpa = newTotalQualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (numberOfCredits != student.numberOfCredits) return false;
        if (Double.compare(student.gpa, gpa) != 0) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + studentId;
        result = 31 * result + numberOfCredits;
        temp = Double.doubleToLongBits(gpa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);

        System.out.println(sally.getGradeLevel());

        Student knuckles = new Student("Knuckles", 2,15,3.5);
        System.out.println(knuckles.getGradeLevel());
        knuckles.addGrade(4,4.0);
        System.out.println(knuckles.getGpa());
    }
}
