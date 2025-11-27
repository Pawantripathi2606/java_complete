import java.util.Scanner;

public class Shorthand {
    static void main(String[] args) {
        System.out.println("short hand operator ");
        int a =5;
        //int b =6;
        //int c = 7;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int x1 = input.nextInt();
         a+=x1;
        System.out.println(a);
        System.out.println("enter your number ");
        int x2 = input.nextInt();
         a -= x2;
        System.out.println(a);
        System.out.println("enter your number");
        int x3 = input.nextInt();
         a *= x3;
        System.out.println(a);




    }
}
