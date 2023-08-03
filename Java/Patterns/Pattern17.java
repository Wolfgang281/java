import java.util.Scanner;

public class Pattern17 {
    public static void pattern(int rows) throws InterruptedException {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                Thread.sleep(5);
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; --i) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                Thread.sleep(5);
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        pattern(rows);
    }
}