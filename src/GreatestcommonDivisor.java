import java.util.Scanner;

public class GreatestcommonDivisor {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number : ");
        int num1 = input.nextInt();
        System.out.println(" enter your second number : ");
        int num2 = input.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println("your gcd is : "+gcd);


    }


    public static int gcd (int num1, int num2){
        int gcd = 1;
        int i =2 ;
        int least = least(num1,num2);
        while(i<=least){
            if(num1%i==0 && num2%i==0 ){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1 , int num2){
        if(num1<num2){
            return num1;
        }
        else {
            return num2;

        }
    }
}
