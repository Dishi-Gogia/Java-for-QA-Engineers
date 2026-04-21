package NumberPrograms;

public class FibonacciSeriesExample {
	
	 public static void main(String[] args) {

	        int first = 0;
	        int second = 1;
	        int count = 10;

	        System.out.println("Fibonacci Series:");

	        for (int i = 1; i <= count; i++) {
	            System.out.print(first + " ");

	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }

}
