package basics;

import java.util.Scanner;

public class Return_parameter_argument {
    static void main(String[] args) {

        greet();
        int first = readnumber();
        int second =   readnumber();
        int sum = add(first,second); //arguments -- passing values
        System.out.println("your addition is : "+sum);

    }
    public static void greet(){
        System.out.println("welcome to calculator");

    }

    public static int readnumber(){  //using datatype to return
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number : ");
        int number = input.nextInt();
        return number; // return
    }

    public static int add(int first , int second){  // paramters   -- defining
        return first+second;
    }
}
