package basics;

public class Variables {
   public static void main(String[] args) {
       int mynum=32;
       System.out.println(mynum);
       int yournum;
      // System.out.println(yournum);
       mynum=1234;
       System.out.println("this is your number " + mynum);
       System.out.println(String.format("this is your number %d" , mynum));
       System.out.printf("this is your number %d\n " , mynum);
       yournum= 1010101;
       System.out.println("this is your previously defined variable value "+yournum);

        // the direct value we use in program is called literals
       // literals are assigned after veriables

       // datatype identifiers = literals


       boolean isveg = false ;
       System.out.println(isveg);

       float num=5.0f;
       System.out.println(num);

       float num2=5;
       System.out.println(num);

       double mydouble = 456;
       System.out.println(mydouble);

       String wishes = "heyyy congo[";
       System.out.println(wishes);
    }
}
