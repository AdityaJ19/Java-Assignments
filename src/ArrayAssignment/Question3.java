package ArrayAssignment;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
  //Question3 :- Take an array of numbers as input and check if it is an array sorted in ascending order.
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] numbers=new int[size];
    //Input
        for (int i = 0; i <size ; i++) {
            numbers[i]= sc.nextInt();
        }

        boolean isAscending=true;

        for (int i = 0; i < numbers.length-1 ; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
        }
            if (isAscending){
                System.out.println("This is in Ascending Order");
            }
            else{
                System.out.println("This is not in Ascending Order");
            }
    }
}
