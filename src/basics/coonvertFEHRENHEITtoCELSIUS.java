package basics;

import java.util.Scanner;

public class coonvertFEHRENHEITtoCELSIUS {
    // FORMAULA -- C = (F-32)*5/9

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // System.out.println("enter your calsius : ");
      //  double c = input.nextDouble();
        System.out.println("enter your fehrenheit : ");
        double f = input.nextDouble();

        double c = (f-32)*5/9;

        System.out.println(c);
    }
}
