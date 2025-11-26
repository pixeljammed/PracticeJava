package bites.examples;

import java.util.HashMap;

public class ScrabbleScore {

    HashMap<Character, Integer> letterValues;

    public ScrabbleScore() {
        letterValues = new HashMap<>();
        Character[] Alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Integer[] scrabbleValues = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        for (int i = 0; i < Alphabet.length; i++) {
            letterValues.put(Alphabet[i], scrabbleValues[i]);
        }
    }

    public Integer Calculate(String word) {
        word = word.toUpperCase();
        char[] wordArray = word.toCharArray();
        int total = 0;
        for (char c : wordArray) {
            total = total + letterValues.get(c);
        }
        return total;
    }

    public static void main(String[] args) {


        ScrabbleScore ss = new ScrabbleScore();
        System.out.print(ss.Calculate("milotek"));
        System.out.print("\n");
        System.out.print(ss.Calculate("olliejeffcote"));
    }
}
