package array;

import java.util.Scanner;

public class arraySearching {
  public   static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr={1,4,5,6,7,3,4,6,7,8,977};
        System.out.println("enter the number you have to search");
        int num = input.nextInt();
        boolean isfound = isfound(arr , num);
        if (isfound){
            System.out.println(" number found");
        }
        else {
            System.out.println(" number is not found ");
        }



    }

    public static boolean isfound(int[]  arr, int num){
        int index = 0 ;
        while( index < arr.length){
            if (arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
