package array;

public class mergetwosortedarray {
    static void main(String[] args) {
        System.out.println("enter values of first array");
        int[] arr1 = ArrayUtility.inputArray();
        ArrayUtility.displayarr(arr1);
        int[] arr2 = ArrayUtility.inputArray();
        ArrayUtility.displayarr(arr2);
        int [] marge = merge(arr1,arr2);
        System.out.println("merged array");
        ArrayUtility.displayarr(marge);


    }

    public static int[] merge(int[] arr1 , int[] arr2 ){
        int newsize= arr1.length+arr2.length;
        int[] newarr = new int[newsize];
        int index = 0 ;  // this store value newarr
        int i = 0 , j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                newarr[index] = arr1[i];
                index++;
                i++;
            }
            else {
                newarr[index] = arr2[j];
                index ++;
                j++;
            }

        }

        while(j<arr2.length){
            newarr[index]=arr2[j];
            index++;
            j++;
        }
        while (i<arr1.length){
            newarr[index] = arr1[i];
            index++;
            i++;
        }
        return newarr;

    }



}
