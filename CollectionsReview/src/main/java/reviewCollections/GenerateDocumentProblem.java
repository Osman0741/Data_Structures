package reviewCollections;

import java.util.HashMap;

public class GenerateDocumentProblem {

    public static void main(String[] args) {
        String list="!veDJaCyd vaeo perelo xw";
        String document="Cydeo Java Develo";
        System.out.println(generateDocumentBruteForce(list, document));
        System.out.println(generateDocumentOptimal(list,document));

    }

    public static boolean generateDocumentBruteForce(String charString, String document) {

        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            int documentCharFreq = countCharFrequency(character, document);
            int charListFreq = countCharFrequency(character, charString);

            if (documentCharFreq > charListFreq) return false;
        }
        return true;
    }

    public static int countCharFrequency(Character character, String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (character == c) count++;
        }
        return count;
    }

    public static boolean generateDocumentOptimal(String charString, String document) {

        HashMap<Character, Integer> charCounts = new HashMap<>();
        int count;
        for (int i = 0; i < charString.length(); i++) {
            char character = charString.charAt(i);
            charCounts.put(character,charCounts.getOrDefault(character,0)+1);
//            if (!charCounts.containsKey(character)) {
//                charCounts.put(character, 1);
//            } else {
//                count = charCounts.get(character);
//                charCounts.put(character, count + 1);
//            }
        }
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            if (!charCounts.containsKey(character) || charCounts.get(character) == 0) return false;
            charCounts.put(character, charCounts.get(character) - 1);

        }

        return true;
    }

}
