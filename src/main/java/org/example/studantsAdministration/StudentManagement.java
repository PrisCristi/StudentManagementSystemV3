package org.example.studantsAdministration;

import java.util.Arrays;

public class StudentManagement {
    private static String[] studentNames = new String[5];
    private static String[] studentId = new String[5];
    private String enrolledCourse;
    private static int totalStudents = 0;

    public StudentManagement(String[] studentName, String[] studentId, String enrolledCourse, int totalStudents) {
        this.studentNames = studentName;
        this.studentId = studentId;
        this.totalStudents = totalStudents;
        this.enrolledCourse = enrolledCourse;
    }

    public static String[] getStudentNames() {
        return studentNames;
    }

    public static void setStudentNames(String[] studentNames) {
        StudentManagement.studentNames = studentNames;
    }

    public String getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(String enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void setTotalStudents(int totalStudents) {
        StudentManagement.totalStudents = totalStudents;
    }

    public static String[] getStudentName() {
        return studentNames;
    }
    public static void setStudentName(String[] studentName) {
        StudentManagement.studentNames = studentName;
    }
    public static String[] getStudentId() {
        return studentId;
    }
    public static void setStudentId(String[] studentId) {
        StudentManagement.studentId = studentId;
    }

    public static void addStudent(String[] studentNames, String[] studentId, int totalStudents) {
        if (totalStudents < studentNames.length) {
            studentNames[totalStudents] = "Priscila";
            studentId[totalStudents] = "54321";
            totalStudents++;

            System.out.println("Student added.");
        } else {
            System.out.println("No more student can be added.");
        }
    }
    public static void deleteStudent(String[] studentNames, String[] studentId, int totalStudents) {
        for (int i = 0; i < totalStudents; i++) {
            if (studentNames[i].equals(studentNames)) {
                studentNames[i] = studentNames[totalStudents - 1];
                studentId[i] = studentId[totalStudents - 1];
                totalStudents--;
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void updateStudent(String[] studentNames, String[] studentIdUpdated, int totalStudents)  {
        for (int i = 0; i < totalStudents; i++) {
            if (studentNames[i].equals(studentNames)) {
                studentId[i] = Arrays.toString(studentIdUpdated);
                System.out.println("Student was updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void displayStudent() {
        System.out.println("Student List:");
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Username: " + studentNames[i] + ", Password: " + studentId[i]);
        }
        System.out.println();
    }
}
