package university.elements;

import university.visitors.UniversityVisitor;

public class Teacher implements UniversityMember {
    private final String name;
    private final int experienceYears;

    public Teacher(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() { return name; }
    public int getExperienceYears() { return experienceYears; }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visitTeacher(this);
    }
}
