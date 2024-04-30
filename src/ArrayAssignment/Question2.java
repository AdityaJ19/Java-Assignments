package ArrayAssignment;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Question2 :- Find the maximum & minimum number in an array of integers.
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int numbers[]=new int[size];

        //Input
        for (int i = 0; i <size ; i++) {
            numbers[i]=sc.nextInt();
        }

        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        //Output
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The Largest number is: " + max);
        System.out.println("The Smallest number is: " + min);
    }
}
