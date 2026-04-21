package String_Example;

import java.util.Arrays;

public class AnagramCheckExample {
	
	 public static void main(String[] args) {

	        String str1 = "listen";
	        String str2 = "silent";

	        char[] arr1 = str1.toLowerCase().toCharArray();
	        char[] arr2 = str2.toLowerCase().toCharArray();

	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println(str1 + " and " + str2 + " are Anagrams");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not Anagrams");
	        }
	    }

}
