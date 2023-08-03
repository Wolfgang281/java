import java.util.Scanner;

public class SwastikPattern {
    public static void pattern(int row) {
        int mid = row / 2 + 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j == mid || i == mid || (j == 1 && i <= mid) || (i == row && j <= mid) || (i >= mid && j == row)
                        || (j >= mid && i == 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        if (rows % 2 == 0) {
            rows++;
        }
        pattern(rows);
    }
}
