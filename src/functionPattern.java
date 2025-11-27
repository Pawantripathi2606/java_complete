public class functionPattern {

    public static void main(String[] args) {
        System.out.println("your patterns are ");
        patt1();
    }

    public static void patt1() {

        int row = 1;

        while (row <= 5) {

            int col = 1;
            while (col <= row) {
                System.out.print(" *");   // same line
                col++;
            }

            System.out.println();  // next line
            row++;
        }
    }
}
