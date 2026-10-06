package ClassesObjects;
// Create a Circle class with a static int count field. Increment it in the constructor and print how many circles were created.

public class Circle {
    static int count;

    Circle(){
        count++;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        System.out.println(Circle.count + " circle are created" );
    }
}

