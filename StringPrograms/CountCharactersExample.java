package String_Example;

public class CountCharactersExample {
	
	public static void main(String[] args) {

        String text = "Quality Assurance";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Total Characters (excluding spaces): " + count);
    }

}
