package NumberPrograms;

public class ArmstrongNumberExample {
	
	public static void main(String[] args) {

        int number = 153;
        int originalNumber = number;
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result += digit * digit * digit;
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }
    }

}
