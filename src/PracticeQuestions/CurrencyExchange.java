package PracticeQuestions;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter your Amount: ");
        double a=S.nextInt();
        double b=a*80;
        System.out.println("This is your amount: "+b);
    }
}
