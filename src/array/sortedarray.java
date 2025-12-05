package array;

public class sortedarray {
    static void main(String[] args) {
        int[] numArr=ArrayUtility.inputArray();
        System.out.println("checking of array is sorted or not");
        boolean issort=isSorted(numArr);
        boolean isnot = isnotsorted(numArr);
        if (issort || isnot){
            System.out.println("your array is sorted");

        }
        else{
            System.out.println("your array is not sorted");
        }
    }
    public static boolean isSorted(int[] numArr){
        int i = 1 ;
        while(i<numArr.length){
            if (numArr[i]<numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isnotsorted(int[] numArr){
        int i = 1 ;
        while(i<numArr.length){
            if (numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

}
