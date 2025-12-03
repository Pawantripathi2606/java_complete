package basics;

public class unary {
    static void main(String[] args) {
        int a = 5 ;
        int b =-a;
        int c =-b;
        System.out.println(c);

        //pre increment ++a  and post increment is a++
        a++;
        System.out.println(a);
        --a;  //post decrement is --a;
        System.out.println(a);
    }
}
