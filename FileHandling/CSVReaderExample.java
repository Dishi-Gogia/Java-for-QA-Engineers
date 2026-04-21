package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
	
	 public static void main(String[] args) {

	        String filePath = "employees.csv";
	        String line;

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(filePath));

	            while ((line = reader.readLine()) != null) {

	                String[] values = line.split(",");

	                System.out.println("Employee ID: " + values[0]);
	                System.out.println("Employee Name: " + values[1]);
	                System.out.println("Department: " + values[2]);
	                System.out.println("----------------------------");
	            }

	            reader.close();

	        } catch (IOException e) {
	            System.out.println("Error while reading CSV file: " + e.getMessage());
	        }
	    }

}
