package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileExample {
	
	 public static void main(String[] args) {

	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"));

	            writer.write("Welcome to Java File Handling");
	            writer.newLine();
	            writer.write("This is a sample text file");

	            writer.close();

	            System.out.println("File written successfully");

	        } catch (IOException e) {
	            System.out.println("Error while writing file: " + e.getMessage());
	        }
	    }

}
