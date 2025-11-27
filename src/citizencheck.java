import java.util.Scanner;
// if else ladder
public class citizencheck {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" enter your age please ");

        int umar = input.nextInt();

        if (umar <=16) {
            System.out.println("you are child");
        }
        else if (umar >= 16 && umar <= 50)
        {
            System.out.println("you are adult");}

        else {
            System.out.println("you are sr citizen");
        }

    }
}
