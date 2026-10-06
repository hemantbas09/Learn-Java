package ClassesObjects;
// Create a Student class with a method getGrade() that returns 'A'/'B'/'C'/'F' based on marks; test multiple students.

public class GradedStudent {
    private final int marks;

    GradedStudent(int marks){
        this.marks=marks;
    }

    public char getGrade() {
        if (marks >= 80) {
            return 'A';
        } else if (marks >= 50) {
            return 'B';
        } else if (marks >= 20) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        GradedStudent student1 = new GradedStudent(70);
        GradedStudent student2 = new GradedStudent(85);
        GradedStudent student3 = new GradedStudent(45);
        GradedStudent student4 = new GradedStudent(10);

        System.out.println(student1.getGrade());   // B
        System.out.println(student2.getGrade());   // A
        System.out.println(student3.getGrade());   // C
        System.out.println(student4.getGrade());   // F


    }
}

