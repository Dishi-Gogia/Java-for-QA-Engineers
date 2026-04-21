package Arrays;

public class MissingNumberExample {
	
	public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5};

        int n = 5;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }

}
