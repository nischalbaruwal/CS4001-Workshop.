public class InvertedTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int i = rows;

        while (i >= 1) {

            int n = 1;
            while (n <= i) {
                System.out.print(n);
                n++;
            }

            System.out.println();
            i--;
        }
    }
}
