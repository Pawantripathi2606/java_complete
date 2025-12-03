package basics;

import java.util.Scanner;

public class armstrongnumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to armstrong number");
        System.out.print("enter your number : ");
        int num = input.nextInt();
       boolean isarmstrong= isarmstrong(num);
            if(isarmstrong){
                System.out.println("your number is armstrong");
            }
            else{
                System.out.println("your number is not armstrong");
            }



    }
    public static boolean isarmstrong( int num){
        int noofdigits = digitcount(num);
        int numcopy = num;
        int finalnumber = 0;
        while ( num > 0 ){
            int lastdigit = num % 10 ;
            num /=10;
            finalnumber += power(lastdigit,noofdigits);
        }
        return finalnumber==numcopy;
    }

    public static  int power(int num1 , int num2){
        int result = 1;
        int i = 0 ;
        while( i< num2){
            result *= num1;
            i++;
        }


        return  result;

    }


    public static int digitcount(int num){
        int digits = 0 ;
        while (num>0){
            digits++;
            num /=10;
        }

        return digits;
    }
}
