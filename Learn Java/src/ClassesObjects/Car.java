package ClassesObjects;
// Create a Car class with fields brand and speed. Add a method accelerate(int increment) that increases speed and prints the new value.

public class Car {

    private final String brand;
    private  int speed;

    Car(String brand, int speed){
        this.brand= brand;
        this.speed=speed;
    }

    public void accelerate(int increment){
        speed=speed + increment;
        System.out.println("The speed of the " + brand + "after increase accelerate is " + speed);
    }

    public static void main(String[] args) {
        Car car=new Car("Tesla",100);
        car.accelerate(50);
    }
}

