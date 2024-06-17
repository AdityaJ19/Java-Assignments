package PatternQuestions;

public class Pattern1 {
    public static void main(String[] args) {
        Pattern2(4);
    }
    static void Pattern1(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row>n ? 2*n - row:row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        }

    static void Pattern2(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row>n ? 2*n - row:row;

            int noOfSpaces = n-totalColInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.println(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
