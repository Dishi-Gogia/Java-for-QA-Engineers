package Exception_Handling;

public class ThrowVsThrowsExample {
	
	public static void validateAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void readFile() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("File read successfully");
    }

    public static void main(String[] args) {

        try {
            validateAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            readFile();
        } catch (InterruptedException e) {
            System.out.println("Exception while reading file");
        }
    }

}
