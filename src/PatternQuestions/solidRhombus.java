package PatternQuestions;

import java.util.Scanner;

public class solidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=5 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
