package InterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the number: "+ num);

//        int rev = 0;
//        while(num != 0){
//            rev = rev*10 + num%10;
//            num = num/10;
//        }

        //Using StringBuffer
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        System.out.println("the reverse number is: "+ rev);

        //Using StringBuilder
        StringBuilder sbs = new StringBuilder();
        sbs.append(num);
        StringBuilder rev = sbs.reverse();
        System.out.println("the reverse number is: "+ rev);
    }
}
