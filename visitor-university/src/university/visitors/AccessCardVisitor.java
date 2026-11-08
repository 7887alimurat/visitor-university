package university.visitors;

import university.elements.Staff;
import university.elements.Student;
import university.elements.Teacher;

public class AccessCardVisitor implements UniversityVisitor {
    @Override
    public void visitStudent(Student student) {
        System.out.println("Student " + student.getName() + ": access to classrooms and library");
    }

    @Override
    public void visitTeacher(Teacher teacher) {
        System.out.println("Teacher " + teacher.getName() + ": access to classrooms, labs and department");
    }

    @Override
    public void visitStaff(Staff staff) {
        System.out.println("Staff " + staff.getName() + " (" + staff.getPosition() + "): access to all service rooms");
    }
}
