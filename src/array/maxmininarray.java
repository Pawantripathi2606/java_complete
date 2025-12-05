package array;

public class maxmininarray {
    static void main(String[] args) {
        int[] numarr = ArrayUtility.inputArray();
        int max = max(numarr);
        int min = min(numarr);
        System.out.println("your max is :"+max);
        System.out.println("your min is :"+min);

    }

    public static int max(int[] numarr){
        if (numarr.length == 0){
            return Integer.MIN_VALUE;
        }

        int max  = numarr[0];            // in this we are taking max to fist element of the array
        int i = 1;
        while ( i< numarr.length){
            if (max < numarr[i]){
                max = numarr[i];
            }
            i++;

        }
        return max;

    }
    public static int min(int[] numarr){
        int min = Integer.MAX_VALUE;    // int this we are taking the max value in array and then comapre to get minimum
        int i = 0 ;
        while(i<numarr.length){
            if(min>numarr[i]){
                min = numarr[i];

            }
            i++;
        }
        return min;
    }

}
