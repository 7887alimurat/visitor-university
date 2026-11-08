# Visitor Pattern - University

Run:
    javac -d out $(find src -name "*.java")
    java -cp out university.Main

Structure:
- elements/UniversityMember   - Element interface (accept)
- elements/Student, Teacher, Staff - Concrete Elements (double dispatch)
- visitors/UniversityVisitor  - Visitor interface (visitX per element)
- visitors/SalaryVisitor, AccessCardVisitor, ReportVisitor - Concrete Visitors
- Main - Object Structure (List) + client
