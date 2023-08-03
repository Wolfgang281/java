
//for rows == coloums
import java.util.Scanner;

public class Pattern7 {
    public static void pattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i + j == rows + 1)
                    System.out.print("*");
                else
                    System.out.print("_");
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
