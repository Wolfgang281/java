import java.util.Scanner;

public class PerfectNumber {
    public static void perfectNum(int num) {
        int temp = num;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
            temp /= 10;
        }
        if (sum == num)
            System.out.println(sum + " is a Perfect number");
        else
            System.out.println(num + " is not a Perfect number");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        perfectNum(num);
    }
}
