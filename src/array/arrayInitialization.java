package array;

public class arrayInitialization {
    static void main(String[] args) {
        int[] myarr = new int[5];
        myarr[0]=98;
        myarr[1]=28;
        myarr[2]=98;
        myarr[3]=98;
        myarr[4]=98;

//        System.out.print(myarr[0]);
//        System.out.print(myarr[0]);
//        System.out.print(myarr[0]);
//        System.out.print(myarr[0]);
//        System.out.print(myarr[0]);
//        int[] myyarr = {1,2,3,4,5,6,3};
//        System.out.println(myarr);
//        System.out.println(myyarr[5]);

            // array traversal
        int index = 0 ;
        while(index < myarr.length){
            System.out.println(myarr[index]);
            index ++;
        }


    }


}
