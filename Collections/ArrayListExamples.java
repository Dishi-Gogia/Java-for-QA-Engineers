package Collections;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println("ArrayList Elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("First Element: " + fruits.get(0));
        System.out.println("Total Elements: " + fruits.size());
    }
}
