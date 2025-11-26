import java.util.Scanner;

public class addtwonumber{
    static void main(String[] args) {
        System.out.println("welcome to calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("kindly enter the first number to be added : ");
        int a = input.nextInt();
        System.out.println("kindly enter your second number to be added : ");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("hence the fina addition of the number is : "+c);
    }
}