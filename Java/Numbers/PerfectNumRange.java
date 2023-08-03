import java.util.Scanner;

public class PerfectNumRange {
    public static void perfectRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        perfectRange(a, b);
    }
}
