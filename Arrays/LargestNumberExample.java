package Arrays;

public class LargestNumberExample {
	
	public static void main(String[] args) {

        int[] numbers = {15, 42, 8, 99, 23};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest Number: " + largest);
    }

}
