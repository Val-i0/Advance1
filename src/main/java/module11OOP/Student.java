package module11OOP;

import java.util.ArrayList;

// Супер клас Student
class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        setName(name);
        setAge(age);
        setCourse(course);
/*        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name can't be empty");
        }

        if (age > 6 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Age must be between 6 and 100");
        }

        if (course != null && !course.isEmpty()) {
            this.course = course;
        } else {
            System.out.println("Course can't be empty");
        }*/
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("WARN: Name can't be empty!");
            this.name = "Val";
            System.out.println("Default name set: " + this.name); // set default value if user inputs invalid one
        }
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age > 6 && age < 100) {
            this.age = age;
        } else {
            System.out.println("WARN: Age must be between 6 and 100!");
            this.age = 7;
            System.out.println("Default age set: " + this.age);
        }
    }

    public String getCourse() {
        return course;
    }

    private void setCourse(String course) {
        if (course != null && !course.isEmpty()) {
            this.course = course;
        } else {
            System.out.println("WARN: Course can't be empty!");
            this.course = "Literature";
            System.out.println("Default course set: " + this.course);
        }
    }
}