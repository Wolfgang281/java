
//for rows == coloums and odd values only
import java.util.Scanner;

public class Pattern10 {
    public static void pattern(int rows) {
        int mid = rows / 2 + 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == mid || j == mid)
                    System.out.print(" *");
                else
                    System.out.print(" -");
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
