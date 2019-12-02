package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    // getters and setters
    public String getFirstName(){return firstName;}
    void setFirstName(String aFirstName){firstName = aFirstName;}

    public  String getLastName(){return lastName;}
    void setLastName(String aLastName){lastName = aLastName;}

    public String getSubject(){return subject;}
    void setSubject(String aSubject){subject = aSubject;}

    public int getYearsTeaching(){return yearsTeaching;}
    void setYearsTeaching(int aYearsTeaching){yearsTeaching = aYearsTeaching;}
}
