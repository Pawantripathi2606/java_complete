import java.util.Scanner;

public class sumofallodd {   // sum of all odd number from 1 to specified number N
    static void main(String[] args) {

        int num = odd();
        sum(num);


    }

    public static int odd() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your numbr : ");
        int num = input.nextInt();
        return num;
    }
    public  static  void  sum(int num){
        int i = 1;
        int sum = 0;
        while (i<=num){
            if(i%2!=0){   // we can also use this logic that sum+=i and then i +=2;
            sum +=i;}
        i++;

        }
        System.out.println("sum of all odd number from 1 to 10 is : " + num + "=" +sum);
    }
}