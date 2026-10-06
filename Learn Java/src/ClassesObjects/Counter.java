package ClassesObjects;
// Create a Counter class with a static int total. Every time any object is created, total goes up; print total from a second object.

public class Counter {
    static int total;

    Counter(){
        total++;
    }

    public void printTotal(){
        System.out.println("There are " + total + " object are created");
    }

    public static void main(String[] args) {
        Counter counter=new Counter();
        Counter counter1=new Counter();

        counter1.printTotal();
    }
}

