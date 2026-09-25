package Constructors;

//Q1.Create Student with name and age, no constructor written. Create an object, print values. What do you observe and why?
//Q2.Write an explicit no-arg constructor for Student setting name = "Unknown", age = 0. Compare it to relying on Java's default constructor.

public class DefaultConstructors {
    public static void main(String[] args) {
        // Q1: no constructor declared -> only default no-arg constructor exists.
        Student student = new Student();
        System.out.println("Q1 -> name: " + student.getName() + ", age: " + student.getAge());

        // Q2: explicit no-arg constructor sets values
        Student1 student1 = new Student1();
        System.out.println("Q2 -> name: " + student1.getName() + ", age: " + student1.getAge());
    }

    //Solve Question 1:
    static class Student {
        private String name;
        private int age;

        // no constructor written here but java creates a default constructor without parameters

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    //Solve Question 2:
    static class Student1 {
        private String name;
        private int age;

        Student1() {
            this.name = "Unknown";
            this.age = 0;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
