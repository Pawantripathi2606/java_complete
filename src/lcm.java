import java.util.Scanner;

public class lcm {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number");
        int first = input.nextInt();
        System.out.println("enter your second number");
        int second = input.nextInt();
        int leastfact = lcm(first,second);
        System.out.println("final lcm is : "+ leastfact);


    }
    public static int lcm(int first , int second){
        int i = 1 ;
        while (true){
            int fact = first *i;
            if (fact % second==0){
                return fact;
            }
            i++;

        }

    }
}

