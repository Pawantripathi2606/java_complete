package basics;

import java.util.Scanner;

public class swap {
    static void main(String[] args) {
        int a = 9 ;
        System.out.println(a);
        int b = 2;
        System.out.println(b);

        System.out.println("the basics.swap of both number is");
        int c =a ;
        a =b ;
        b =c ;

        System.out.println(a);
        System.out.println(b);
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first value");
        int d = input.nextInt();
        System.out.println("enter your second number");
        int e = input.nextInt();

        System.out.println("now we are swapping ");

        int f = d;
        d = e ;
        e=f;

        System.out.println("your first value is "+d);
        System.out.println("your second value is "+e);

    }
}
