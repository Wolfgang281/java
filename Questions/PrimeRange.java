import java.util.Scanner;

class PrimeRange {
    public static void prime(int m, int n) {
        for (int i = m; i <= n; i++) {
            int num = i;
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        prime(m, n);
    }
}