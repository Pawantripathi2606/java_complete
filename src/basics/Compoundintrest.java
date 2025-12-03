package basics;

import java.util.Scanner;

public class Compoundintrest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("compound intrest - p(1+r/100)^t");
        System.out.println("enter your principal");
        float principal = input.nextFloat();
        System.out.println("enter your rate");
        float rate = input.nextFloat();
        System.out.println("enter your time");
        float time = input.nextFloat();

        double coi = principal*Math.pow((1+rate/100), time);

        System.out.println("your compound intrest is : - "+coi);
    }
}
