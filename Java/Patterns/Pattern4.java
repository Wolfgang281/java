import java.util.Scanner;

public class Pattern4 {
    public static void pattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 2 && j == 2) {
                    System.out.print(" @ ");
                } else if (i == rows && j == cols - 1) {
                    System.out.print(" ! ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        pattern(rows, cols);
    }
}
