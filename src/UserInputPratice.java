import java.util.Scanner;

public class UserInputPratice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        System.out.println("ok , your name is : "+name);
        //input.nextLine();
        System.out.println("what is your age?");
        int age = input.nextInt();
        System.out.println(name+"your age is "+age);

        System.out.println("hence the output is " + name+age);

    }
}
