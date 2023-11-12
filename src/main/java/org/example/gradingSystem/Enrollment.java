package org.example.gradingSystem;
import org.example.coursesAdministration.Course;
import org.example.studentsAdministration.Student;

public class Enrollment {
    private double grade;
    private Student student;
    private Course course;

    public Enrollment(double grade, Student student, Course course) {
        this.grade = grade;
        this.student = student;
        this.course = course;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}
