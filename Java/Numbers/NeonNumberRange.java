import java.util.Scanner;

public class NeonNumberRange {
    public static void range(int a, int b) {
        for (int i = a; i <= b; i++) {
            int num = i * i;
            int temp = num;
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            if (sum == i)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        range(a, b);
    }
}
