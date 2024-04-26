import java.sql.SQLOutput;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter the value of Principle: ");
        int p=S.nextInt();
        System.out.println("Enter the value of Rate:");
        int r=S.nextInt();
        System.out.println("Enter the value of Time:");
        int t=S.nextInt();
        double si=(p*r*t)/100;
        System.out.println("The simple interest is: "+ si);
    }
}
