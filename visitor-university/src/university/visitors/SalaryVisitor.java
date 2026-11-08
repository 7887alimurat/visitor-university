package university.visitors;

import university.elements.Staff;
import university.elements.Student;
import university.elements.Teacher;

public class SalaryVisitor implements UniversityVisitor {
    @Override
    public void visitStudent(Student student) {
        int scholarship = student.getGpa() >= 3.5 ? 50000 : 0;
        System.out.println("Student " + student.getName() + ": scholarship " + scholarship + " KZT");
    }

    @Override
    public void visitTeacher(Teacher teacher) {
        int salary = 300000 + teacher.getExperienceYears() * 10000;
        System.out.println("Teacher " + teacher.getName() + ": salary " + salary + " KZT");
    }

    @Override
    public void visitStaff(Staff staff) {
        System.out.println("Staff " + staff.getName() + ": salary 200000 KZT");
    }
}
