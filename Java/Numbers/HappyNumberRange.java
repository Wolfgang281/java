import java.util.Scanner;

public class HappyNumberRange {
    public static void range(int a, int b) {
        for (int i = a; i <= b; i++) {
            int temp = i;
            while (temp != 1 && temp != 4) {
                int sum = 0;
                while (temp != 0) {
                    int rem = temp % 10;
                    sum += rem * rem;
                    temp /= 10;
                }
                temp = sum;
            }
            if (temp == 1)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        range(a, b);
    }
}
