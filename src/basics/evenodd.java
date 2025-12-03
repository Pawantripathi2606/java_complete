package basics;

import java.util.Scanner;

public class evenodd {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number ");
        int a = input.nextInt();
        if (a % 2 == 0){
            System.out.println("even");}
        else{
            System.out.println("this is odd");
        }
    }
}

// using bitwise == if ((a & 1)==1 --- odd else even
