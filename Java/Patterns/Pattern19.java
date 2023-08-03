import java.util.Scanner;

public class Pattern19 {
    public static void pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j % 2 == 1)
                    System.out.print(0);
                else
                    System.out.print(1);
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
