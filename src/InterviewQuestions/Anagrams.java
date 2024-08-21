package InterviewQuestions;

import java.util.Arrays;

public class Anagrams {

    public static boolean isAnagram(String str1, String str2){

        String s1 = str1.replaceAll("//s", "");
        String s2 = str2.replaceAll("//s", "");

        if (str1.length() != str2.length()){
            return false;
        }
        else{
            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str1.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
    }
    public static void main(String[] args) {

        System.out.println(isAnagram("teacher", "cheater"));

    }
}
