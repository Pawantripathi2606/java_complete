import java.util.Scanner;

public class palindromenumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number : ");
        int num = input.nextInt();
        boolean ispalendrome = ispelendrome(num);
        if (ispalendrome){
            System.out.println("this is pelendrome");
        }
        else {
            System.out.println("this is not palendrome");
        }


    }
    public  static  boolean ispelendrome(int num ){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newnum = 0 ;
        while (num>0){
            int digit = num % 10;
            newnum = newnum *10 +digit;
            num /=10;
        }
        return newnum;
    }
}
