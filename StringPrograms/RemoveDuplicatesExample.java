package String_Example;

public class RemoveDuplicatesExample {
	
	public static void main(String[] args) {

        String text = "programming";
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);

            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        System.out.println("Original String: " + text);
        System.out.println("After Removing Duplicates: " + result);
    }

}
