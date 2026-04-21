package Basic;

public class OperatorsExample {
	
	public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operators
        int value = 5;
        value += 3;
        System.out.println("\nAssignment Operator Result: " + value);

        // Unary Operators
        int number = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("Original Number: " + number);
        System.out.println("Pre-Increment: " + (++number));
        System.out.println("Post-Increment: " + (number++));
        System.out.println("After Post-Increment: " + number);

        // Ternary Operator
        int age = 20;
        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";

        System.out.println("\nTernary Operator:");
        System.out.println(result);
    }

}
