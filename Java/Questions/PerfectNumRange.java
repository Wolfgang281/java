import java.util.Scanner;

public class PerfectNumRange {

    public static void perfect(int m, int n) {
        for (int i = m; i <= n; i++) {
            int sum = 0;
            int num = i;
            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
            if (sum == num)
                System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        perfect(m, n);
    }
}
