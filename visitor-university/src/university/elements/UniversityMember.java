package university.elements;

import university.visitors.UniversityVisitor;

public interface UniversityMember {
    void accept(UniversityVisitor visitor);
}
