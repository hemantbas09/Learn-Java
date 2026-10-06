package ClassesObjects;
// Create a Complex class with real and imag. Write a method add(Complex other) that returns a new Complex representing the sum.

public class Complex {
    private double real;
    private double imag;

    Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other ){
        double newReal=real + other.real;
        double newIma=imag + other.imag;

        return new Complex(newReal,newIma);
    }

    public void print(){
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Complex a = new Complex(3, 4);
        Complex b = new Complex(1, 2);
        Complex c = a.add(b);
        a.print();
        b.print();
        c.print();
    }
}

