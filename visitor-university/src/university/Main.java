package university;

import university.elements.Staff;
import university.elements.Student;
import university.elements.Teacher;
import university.elements.UniversityMember;
import university.visitors.AccessCardVisitor;
import university.visitors.ReportVisitor;
import university.visitors.SalaryVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Object Structure
        List<UniversityMember> members = new ArrayList<>();
        members.add(new Student("Alimurat", 3.7));
        members.add(new Student("Alan", 3.2));
        members.add(new Teacher("Ivanov I.I.", 8));
        members.add(new Staff("Petrova A.K.", "Secretary"));

        System.out.println("=== Payments ===");
        SalaryVisitor salary = new SalaryVisitor();
        for (UniversityMember m : members) m.accept(salary);

        System.out.println("\n=== Access rights ===");
        AccessCardVisitor access = new AccessCardVisitor();
        for (UniversityMember m : members) m.accept(access);

        System.out.println("\n=== Report ===");
        ReportVisitor report = new ReportVisitor();
        for (UniversityMember m : members) m.accept(report);
        report.printReport();
    }
}
