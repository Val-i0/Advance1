package module11OOP;

public class HighSchoolStudent extends Student {
    private int grade;

    public HighSchoolStudent(String name, int age, String course, int grade) {
        super(name, age, course);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
