public class MiniSeating {
    public static void main(String[] args) {

        String[][] seats = new String[2][3];

        seats[0][0] = "Nischal";
        seats[0][1] = "James";
        seats[0][2] = "David";

        System.out.println("Seating Chart:");

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == null) {
                    System.out.print("[empty]\t");
                } else {
                    System.out.print(seats[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
