package university.elements;

import university.visitors.UniversityVisitor;

public class Student implements UniversityMember {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public double getGpa() { return gpa; }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visitStudent(this);
    }
}
