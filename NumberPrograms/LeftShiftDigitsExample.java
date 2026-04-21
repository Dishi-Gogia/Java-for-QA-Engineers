package NumberPrograms;

public class LeftShiftDigitsExample {
	
	public static void main(String[] args) {

        int number = 12345;
        int k = 4;

        int divisor = (int) Math.pow(10, k);
        int lastPart = number % divisor;
        int remainingPart = number / divisor;

        int digitsInRemainingPart = String.valueOf(remainingPart).length();
        int multiplier = (int) Math.pow(10, digitsInRemainingPart);

        int result = lastPart * multiplier + remainingPart;

        System.out.println("Original Number: " + number);
        System.out.println("Shifted Number: " + result);
    }

}
