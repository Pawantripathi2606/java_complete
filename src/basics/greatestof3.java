package basics;

import java.util.Scanner;

public class greatestof3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" greatest of 3");
        System.out.println(" enter your first number ");
        int a = input.nextInt();
        System.out.println("enter your second number");
        int b = input.nextInt();
        System.out.println("enter your third number ");
        int c = input.nextInt();

        if (a < b &&  b < c){
            System.out.println(" your third number is greater ");
        }

        else if ( a < b && c<b) {
            System.out.println(" your second number is greater");

        }

        else {
            System.out.println(" your first numebr is greater");
        }
    }
}
