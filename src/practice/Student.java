package practice;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // get/set name
    public String getName(){
        return name;
    }

    void setName(String aName){
        name = aName;
    }

    // get/set studentId
    public int getStudentId(){
        return studentId;
    }

    void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    // get/set numberOfCredits
    public int getNumberOfCredits(){return numberOfCredits;}

    void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    // get/set gpa
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
