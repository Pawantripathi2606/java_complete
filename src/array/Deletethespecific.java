package array;

import java.util.Scanner;

public class Deletethespecific {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numarr= ArrayUtility.inputArray();
        System.out.println("enter the number you have to check : ");
        int no = input.nextInt();
        int[] newarr = deletenumber(numarr,no);
        System.out.println("here is your new arry");
        ArrayUtility.displayarr(newarr);
    }

    public static int[] deletenumber(int[] numarr  , int no){
     int occ = NoOfOccurence.noofoccur(numarr,no);
     if(occ == 0){                                         // no of occurance in array to be deleted
         return numarr;
     }
     int newsize = numarr.length-occ;
     int[] newarr = new int[newsize];

     int i = 0 , j = 0 ;      //copy of array
     while(i<numarr.length){
         if (numarr[i] != no){
             newarr[j] = numarr[i];
             j++;
         }
         i++;
     }

     return newarr;
    }
}
