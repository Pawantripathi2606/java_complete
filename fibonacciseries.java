import java.util.Scanner;

public class fibonacciseries {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter your number :");
        int num = input.nextInt();
        fibo(num);
        System.out.print(num);

    }

    public static void fibo(int num){
        if (num<0) return;
        System.out.println("0 ");
        if (num == 0) return;
        int first = 0 , second = 1 ;
        while (first + second <= num){
            int third = first+second;
            System.out.print(third+" ");
            first = second;
            second=third;
        }
    }
}
