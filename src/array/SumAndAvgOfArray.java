package array;

public class SumAndAvgOfArray {
   public static void main(String[] args) {
        System.out.println("welcome to sum and avg in array ");
        int [] numArray= ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = avg(numArray);
        System.out.println("your sum is : "+sum);
        System.out.println("your avg is : "+avg);
    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i< numArray.length){
            sum +=numArray[i];
            i++;
        }

        return sum;
    }

    public static int avg(int[] numArray){
        long sum = sum(numArray);
        return (int) (sum/ numArray.length);

    }
}
