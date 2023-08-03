
//for rows == coloums
import java.util.Scanner;

public class Pattern8 {
    public static void pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || i + j == rows + 1)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        // int cols = s.nextInt();
        if (rows % 2 == 0) {
            rows++;
        }
        pattern(rows);
    }
}
