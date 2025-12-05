package array;

import java.util.Scanner;

public class NoOfOccurence {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int[] nums = ArrayUtility.inputArray();
        System.out.println("now enter the number you have to find : ");
        int no = input.nextInt();
        int noofoccur = noofoccur(nums , no);
        System.out.println("your number is found"+noofoccur+"time in the array");

    }
    public static int noofoccur(int[] nums , int no){
        int occ = 0 ;
        int i = 0 ;
        while ( i < nums.length){
            if(nums[i]==no){
                occ++;

            }
            i++;
        }



        return occ ;
    }
}
