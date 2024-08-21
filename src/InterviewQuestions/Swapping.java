package InterviewQuestions;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a=b;
//        b=temp;


        //Using XOR operator
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("the values after swapping are: " + a + " " + b );
    }

}
