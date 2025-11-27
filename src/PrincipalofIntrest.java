import java.util.Scanner;

public class PrincipalofIntrest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give your principal");
        float p= input.nextFloat();
        System.out.println("give your time");
        float t= input.nextFloat();
        System.out.println("give your rate");
        float r = input.nextFloat();

        double poi = (p*r*t)/100;
        System.out.println("hence , your final principal of intrest is"+poi);
    }
}
