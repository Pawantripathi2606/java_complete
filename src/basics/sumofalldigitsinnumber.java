package basics;

import java.util.Scanner;

public class sumofalldigitsinnumber {
    static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = sumofdigit(num);
        System.out.println(sum);

    }
    public static int sumofdigit(int num){
        int sum = 0 ;
        while (num>0) {
            sum += num % 10;
            num /= 10;


        }
        return sum;
    }
}
