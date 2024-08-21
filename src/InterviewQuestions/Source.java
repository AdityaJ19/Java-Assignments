package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Source {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lower case for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create frequency maps for both strings
        Map<Character, Integer> charCountMap1 = new HashMap<>();
        Map<Character, Integer> charCountMap2 = new HashMap<>();

        // Populate the frequency maps
        for (char c : str1.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }

        // Compare the frequency maps
        boolean isAnagram = charCountMap1.equals(charCountMap2);

        if (isAnagram) {
            System.out.println("The strings are anagrams.");

            // Compare the first letters if needed
            if (str1.charAt(0) == str2.charAt(0)) {
                System.out.println("The first letters of both strings are the same.");
            } else {
                System.out.println("The first letters of both strings are different.");
            }
        } else {
            System.out.println("The strings are not anagrams.");
        }

        return isAnagram;
    }

    public static void main(String[] args) {
        String string1 = "Listen";
        String string2 = "Silent";

        areAnagrams(string1, string2);
    }
}
