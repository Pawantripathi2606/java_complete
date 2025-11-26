import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write your name please "); // mesg to write your name
        String name = input.nextLine();  // input box to take input


        System.out.println("write your age "); // mesg to write your age

        int age = input.nextInt(); //input box to take input

        input.nextLine(); // creates buffer no need of extra enter



        System.out.println("your name is : " + name); //output with name
        System.out.println("your age is : " +age);      // output with name

    }
}
