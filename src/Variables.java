public class Variables {
   public static void main(String[] args) {
       int mynum=32;
       System.out.println(mynum);
       int yournum;
      // System.out.println(yournum);
       mynum=1234;
       System.out.println("this is your number " + mynum);
       System.out.println(String.format("this is your number %d" , mynum));
       System.out.printf("this is your number %d " , mynum);
    }
}
