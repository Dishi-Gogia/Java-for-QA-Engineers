package Collections;

import java.util.HashSet;

public class HashSetExamples {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Delhi");

        System.out.println("HashSet Elements:");
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("Total Unique Cities: " + cities.size());
    }
}
