package PracticeQuestions;

import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the desired value: ");
        int a= S.nextInt();
        if (a%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}