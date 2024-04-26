import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=S.next();
        System.out.println("Hello " + name);
    }
}
