package array;

public class arrayispallindrome {

    static void main(String[] args) {
        int[] newarr = ArrayUtility.inputArray();
        ArrayUtility.displayarr(newarr);
        boolean ispalindrome = ispalindrome(newarr);
        if(ispalindrome){
            System.out.println("this is palindrome");
        }
        else{
            System.out.println("this is not palindrome");
        }


    }

    public static boolean ispalindrome(int[] newarr){
        int i = 0 ;
        while(i<newarr.length/2){
            if (newarr[i] != newarr[newarr.length-1-i]){
                return  false;

            }
            i++;
    }

        return true;


    }
}
