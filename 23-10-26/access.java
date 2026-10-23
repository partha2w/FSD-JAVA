// Task 1: Student Mark Management System
// Scenario: A college wants to maintain student marks securely. Marks should not be modified directly from outside the class.

// Requirements:
// 1. Create a class Student with private variables studentId, studentName, and marks.
// 2. Create public getter and setter methods for these variables.
// 3. Validate that marks must be between 0 and 100.
// 4. If invalid marks are entered, display an appropriate error message.
// 5. Create a Main class to set and display student details.
// Expected output:
// Student ID: 101
// Student Name: Arun
// Marks: 85
// Invalid marks! Enter marks between 0 and 100.


class Student {
    private int studentId;
    private String studentName;
    private int marks;

    Student(int newId, String name) {
        this.studentId = newId;
        this.studentName = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println(
                "Invalid marks! Enter marks between 0 and 100."
            );
        } else {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class access {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Partha");
        Student s2 = new Student(102, "Rahul");

        s1.setMarks(85);
        s2.setMarks(43);

        System.out.println("Student ID: " + s1.getStudentId());
        System.out.println("Student Name: " + s1.getStudentName());
        System.out.println("Marks: " + s1.getMarks());

        s1.setMarks(120);
    }
}
