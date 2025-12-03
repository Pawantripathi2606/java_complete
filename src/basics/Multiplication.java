package basics;

import java.util.Scanner;

public class Multiplication {
    static void main(String[] args) {
        outp();
        int number = inp();
        multi(number);

    }
    public static void multi(int num ) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + (num * i));
            i++;

        }
    }
    public static int inp() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }
    public static void outp() {
        System.out.println("welcome to multiplication");
        System.out.println("please enter your number");
    }
        }


