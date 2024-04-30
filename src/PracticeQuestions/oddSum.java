package PracticeQuestions;

import java.util.Scanner;
public class oddSum {
    static int sum = 0;
    static int sum (int n ) {
        for (int i =1; i<=n; i++)
            if (i%2==1)
                sum +=i;
        System.out.print("Sum of all odd numbers between 1 to "
                + n + " = ");
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(sum(n));

    }
}
