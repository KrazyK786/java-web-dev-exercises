package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (topic != null ? !topic.equals(course.topic) : course.topic != null) return false;
        if (instructor != null ? !instructor.equals(course.instructor) : course.instructor != null) return false;
        return enrolledStudents != null ? enrolledStudents.equals(course.enrolledStudents) : course.enrolledStudents == null;
    }

    @Override
    public int hashCode() {
        int result = topic != null ? topic.hashCode() : 0;
        result = 31 * result + (instructor != null ? instructor.hashCode() : 0);
        result = 31 * result + (enrolledStudents != null ? enrolledStudents.hashCode() : 0);
        return result;
    }
}
