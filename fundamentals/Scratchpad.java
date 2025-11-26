package bites.examples;

import java.util.Arrays;
import java.util.HashMap;

public class Scratchpad {
    public static void main(String[] args) {
        HashMap<String, Integer[]> scores = new HashMap<>();
        // Fix: Use 'new Integer[] { ... }' for array initialization
        scores.put("Milo", new Integer[] {100, 200, 300, 400});
        scores.put("Dax", new Integer[] {200, 100, 350, 450});
        scores.put("Lukas", new Integer[] {300, 500, 1000, 200});
        scores.put("Robin", new Integer[] {400, 500, 50, 0});
        System.out.println(Arrays.toString(scores.get("Milo")));
    }
}