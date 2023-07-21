import java.util.Scanner;

public class PrimeNum {

    public static void prime(int n) {
        int primeCount = 0;
        for (int i = 2; primeCount < n; i++) {
            int num = i;
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.print(num);
                primeCount++;
                // System.out.println(" " + primeCount);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        prime(n);
    }
}
