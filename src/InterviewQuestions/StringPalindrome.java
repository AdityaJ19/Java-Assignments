package InterviewQuestions;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pal_rev = str;
        String rev = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if (pal_rev.equals(rev)){
            System.out.println(pal_rev + "is a palindrome string");
        }else{
            System.out.println(pal_rev+ " is not a palindrome string");
        }
    }
}
