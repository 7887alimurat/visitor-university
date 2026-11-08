package university.visitors;

import university.elements.Staff;
import university.elements.Student;
import university.elements.Teacher;

public interface UniversityVisitor {
    void visitStudent(Student student);
    void visitTeacher(Teacher teacher);
    void visitStaff(Staff staff);
}
