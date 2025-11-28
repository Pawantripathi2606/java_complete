import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long facto= fact(num);
        System.out.println(facto);



    }
    public static long fact(int num){
        if (num < 2 ){
            return 1;   //edge condition checks if number is less then 2 it gives 1
        }
        long fact = 1;    //start with 1
        int i = 2;          //cheking with 2 that if it is less then useer number then multiply fact 1 to its i value
        while(i <= num){
            fact*=i;
            i++;  // increment after each iteration
        }
        return fact ; //return final fact value
    }
}
