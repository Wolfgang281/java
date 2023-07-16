import java.util.Scanner;

public class SpyNum2 {
    public static void spy(int a, int b) {
        for (int i = a; i <= b; i++) {
            int num = i;
            int sum = 0;
            int prod = 1;
            while (num != 0) {
                int rem = num % 10;
                sum += rem;
                prod *= rem;
                num /= 10;
            }
            if (sum == prod) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        spy(a, b);
    }
}
