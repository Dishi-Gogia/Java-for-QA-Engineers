package Arrays;

public class SecondLargestExample {
	
	public static void main(String[] args) {

        int[] numbers = {15, 42, 8, 99, 23};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + secondLargest);
    }

}
