package ArrayAssignment;

import java.util.Scanner;

public class Question4 {
    //Searching for an element x in a matrix.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int[][] number=new int[row][cols];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <cols ; j++) {
                number[i][j]= sc.nextInt();
            }
        }
        int x= sc.nextInt();

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <cols ; j++) {

                if (number[i][j]==x){
                    System.out.println("x found at the location of ("+ i +" , "+ j +")");
                }
            }
        }

    }
}
