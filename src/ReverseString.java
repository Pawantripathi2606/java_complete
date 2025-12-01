import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int num = input.nextInt();
        int rev = revdigit(num);
        System.out.println(rev);

    }
    public static int revdigit(int num){
        int newnum = 0 ;
        while (num>0) {
           int  digit= num % 10;
            newnum = newnum* 10 + digit;
            num = num / 10;


        }
        return newnum;
    }
}
