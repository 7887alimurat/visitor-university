package university.elements;

import university.visitors.UniversityVisitor;

public class Staff implements UniversityMember {
    private final String name;
    private final String position;

    public Staff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() { return name; }
    public String getPosition() { return position; }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visitStaff(this);
    }
}
