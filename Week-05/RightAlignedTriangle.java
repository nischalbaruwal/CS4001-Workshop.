public class RightAlignedTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;

        while (i <= rows) {

            int s = rows - i;
            while (s > 0) {
                System.out.print(" ");
                s--;
            }

            int n = 1;
            while (n <= i) {
                System.out.print(n);
                n++;
            }

            System.out.println();
            i++;
        }
    }
}
