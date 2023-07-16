import java.util.Scanner;

public class StrongNum {
    public static void strong(int m, int n) {
        for (int i = m; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                int fact = 1;
                for (int j = 1; j <= rem; j++) {
                    fact = fact * j;
                }
                sum += fact;
                num /= 10;
            }
            if (sum == i)
                System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        strong(m, n);
    }
}
