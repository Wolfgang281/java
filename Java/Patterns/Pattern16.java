import java.util.Scanner;

public class Pattern16 {
    public static void pattern(int rows) {
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        pattern(rows);
    }
}