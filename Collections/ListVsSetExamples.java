package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListVsSetExamples {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");

        System.out.println("ArrayList Allows Duplicates:");
        System.out.println(list);

        System.out.println("\nHashSet Does Not Allow Duplicates:");
        System.out.println(set);
    }
}