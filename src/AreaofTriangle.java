import java.util.Scanner;

public class AreaofTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give your breadth");
        int b = input.nextInt();
        System.out.println("give your height");
        int h = input.nextInt();
        System.out.println("so your fina loutput is");
        int aot = (b*h)/2;
        System.out.println(aot);
    }
}
