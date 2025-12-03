package basics;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to ticket counter");

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("are you female (true/false)?");
        boolean isfemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("oh you got 75% discount");
        }
        else if (isfemale) {
            System.out.println("you got 50% discount");
        }
        else if (age > 60 && !isfemale) {
            System.out.println("you got 25% discount");
        }
        else {
            System.out.println("you don't get any discount");
        }
    }
}
