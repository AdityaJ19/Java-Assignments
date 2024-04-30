package ArrayAssignment;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Question:- Take an array of names as input from the user and print them on the screen.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[]= new String[size];
    //Input
        for (int i = 0; i <size; i++) {
            names[i]=sc.next();
        }
    //Output
        for (int i = 0; i < names.length ; i++) {
            System.out.println("name "+(i+1)+" is: "+ names[i]);
        }
    }
}
