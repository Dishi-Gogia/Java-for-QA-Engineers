package Polymorphism;

public class PolymorphismExample {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition of 2 Numbers: " + calc.add(10, 20));
        System.out.println("Addition of 3 Numbers: " + calc.add(10, 20, 30));

        Vehicle vehicle = new Car();
        vehicle.start();
    }
}
