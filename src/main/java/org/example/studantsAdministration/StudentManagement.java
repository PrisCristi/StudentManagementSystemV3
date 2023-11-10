package org.example.studantsAdministration;

public class StudentManagement{
    private static String[] studentName = new String[5];
    private static String[] studentId = new String[5];
    private static int totalstudents = 0;

    public StudentManagement(String[] studentName, String[] studentId, int totalstudents) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.totalstudents = totalstudents;
    }


}
