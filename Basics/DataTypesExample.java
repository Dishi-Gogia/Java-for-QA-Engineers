package Basic;

public class DataTypesExample {
	
			public static void main(String[] args) {

	        // Primitive Data Types
	        byte byteValue = 100;
	        short shortValue = 20000;
	        int intValue = 500000;
	        long longValue = 9876543210L;

	        float floatValue = 45.75f;
	        double doubleValue = 12345.6789;

	        char charValue = 'A';
	        boolean booleanValue = true;

	        // Non-Primitive Data Types
	        String name = "Dishi";
	        int[] numbers = {10, 20, 30, 40, 50};

	        System.out.println("Primitive Data Types:");
	        System.out.println("Byte Value: " + byteValue);
	        System.out.println("Short Value: " + shortValue);
	        System.out.println("Int Value: " + intValue);
	        System.out.println("Long Value: " + longValue);
	        System.out.println("Float Value: " + floatValue);
	        System.out.println("Double Value: " + doubleValue);
	        System.out.println("Char Value: " + charValue);
	        System.out.println("Boolean Value: " + booleanValue);

	        System.out.println("\nNon-Primitive Data Types:");
	        System.out.println("String Value: " + name);

	        System.out.print("Array Values: ");
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	    }
	}


