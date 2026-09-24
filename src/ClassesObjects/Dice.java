package ClassesObjects;
// Create a Dice class that uses java.util.Random. Add a roll() method and print 10 rolls from main.

import java.util.Random;

public class Dice {

    private final Random rand;

    Dice() {
        rand = new Random();
    }

    public int roll() {
        return rand.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        Dice dice= new Dice();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}

