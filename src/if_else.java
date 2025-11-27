import java.util.Scanner;

public class if_else {
    static void main(String[] args) {
        boolean isMale = true ;
        String name = "bob";
        System.out.println("before if ");
        if (isMale){
            System.out.println("mr "+name);
            System.out.println("after if ");


        boolean isfemale = false;
        String names = "priya";
            System.out.println("before if ");

            if (isfemale){
                System.out.println("mrs"+names);
                System.out.println("after if ");}

                else {
                System.out.println("you are male ");


                Scanner input = new Scanner(System.in);
                System.out.println("enter your age to check that you are able to vote");
                int age = input.nextInt();
                if (age<18) {
                    System.out.println("sorry bhai vote krne layak nahi ho tum bade ho jao ");

                }
                else{
                    System.out.println("waah vote kr do ");



                    // checking adult , sr citizen and child



                }
            }
        }
    }
}
