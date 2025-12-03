package basics;

import java.util.Scanner;

public class leapyear {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" enter your year");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("this is leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("this is also leap year");
        } else {
            System.out.println(" this is not a leap year");
        }
    }
}


// if (year % 400 == 0||(year % 4 == 0 && year % 100 != 0))
