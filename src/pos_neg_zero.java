import java.util.Scanner;

public class pos_neg_zero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = sc.nextInt();

        // boolean helper variables
        boolean isZero = (a == 0);
        boolean isPositive = (a > 0);

        if (isPositive) {
            System.out.println("Positive");
        }
        else if (isZero) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Negative");
        }
    }
}
