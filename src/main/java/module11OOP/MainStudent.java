package module11OOP;

public class MainStudent {
    public static void main(String[] args) {

        ManageStudents system = new ManageStudents();

        Student petar = new HighSchoolStudent("Peter", 5, "Math", 9); // mismatch between age and grade not handled.
        system.addStudent(petar);

        Student maria = new UniversityStudent("Maria", 22, "Computer Science", "QA Automation");
        system.addStudent(maria);

        system.displayAllStudents();

        system.searchStudentByName("Maria");
        system.searchStudentByName("Elon");
    }
}
