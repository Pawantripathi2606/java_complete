package array;

public class reversearray {
    static void main(String[] args) {
        int[] newarr = ArrayUtility.inputArray();
        reversearr(newarr);
        System.out.println("your reverse array is : ");
        ArrayUtility.displayarr(newarr);



    }
    public static void reversearr (int[] arr){
            int i = 0 ;
            while(i<arr.length/2){
                int swap = arr[i];
                arr[i] = arr[(arr.length-1)-i];
                arr[(arr.length-1)-i] = swap;
                i++;
            }
    }
}
