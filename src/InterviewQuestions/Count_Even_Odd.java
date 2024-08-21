package InterviewQuestions;

public class Count_Even_Odd {
    public static void main(String[] args) {
        int num = 3573516;
        int even_count = 0;
        int odd_count = 0;
        while(num>0){
            int rem = num%10;
            if (num % 2 == 0) {
                even_count++;

            }else{
                odd_count++;

            }
            num = num/10;
        }
        System.out.println("The total number of even digits are: " + even_count);
        System.out.println("The total number of odd digits are: " + odd_count);
    }
}
