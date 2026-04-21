package Exception_Handling;

public class TryCatchExample {
	
	public static void main(String[] args) {

        try {
            int number = 10 / 0;
            System.out.println("Result: " + number);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot divide by zero");
        } finally {
            System.out.println("Finally block always executes");
        }
    }

}
