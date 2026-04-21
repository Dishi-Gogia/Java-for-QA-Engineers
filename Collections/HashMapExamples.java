package Collections;

import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "John");
        employees.put(102, "David");
        employees.put(103, "Alice");

        System.out.println("Employee Map:");
        for (Integer key : employees.keySet()) {
            System.out.println(key + " - " + employees.get(key));
        }

        System.out.println("Contains Key 101: " + employees.containsKey(101));
    }
}
