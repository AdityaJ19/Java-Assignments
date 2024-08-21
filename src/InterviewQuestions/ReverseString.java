package InterviewQuestions;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Aditya";
        String rev = "";
        
        for (int i = str.length()- 1; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("the reverse String is : " + rev);
        //System.out.println(Arrays.toString(str.toCharArray()));
    }
}
