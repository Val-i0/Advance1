package module11OOP;

import java.util.ArrayList;
import java.util.List;

public class ManageStudents {
    private List<Student> students;

    public ManageStudents() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());

            if (student instanceof HighSchoolStudent) {
                System.out.println("Grade: " + ((HighSchoolStudent) student).getGrade());
            } else if (student instanceof UniversityStudent) {
                System.out.println("Major: " + ((UniversityStudent) student).getMajor());
            }
            System.out.println("--"); // simple divider between students, for readability
        }

    }

/*    public Student searchStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }*/

    public void searchStudentByName(String name) {
        boolean isFound = true;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.printf("Student '%s' FOUND!%n", name);
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Course: " + student.getCourse());
                return;
            } else {
                isFound = false;
            }
        }

        if (!isFound) {
            System.out.printf("Student '%s' NOT found!%n", name);
        }
    }

}
