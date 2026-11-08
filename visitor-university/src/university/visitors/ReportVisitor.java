package university.visitors;

import university.elements.Staff;
import university.elements.Student;
import university.elements.Teacher;

public class ReportVisitor implements UniversityVisitor {
    private int students = 0;
    private int teachers = 0;
    private int staff = 0;

    @Override
    public void visitStudent(Student student) { students++; }

    @Override
    public void visitTeacher(Teacher teacher) { teachers++; }

    @Override
    public void visitStaff(Staff staff) { this.staff++; }

    public void printReport() {
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Staff: " + staff);
    }
}
