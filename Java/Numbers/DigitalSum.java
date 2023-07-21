import java.util.Scanner;

public class DigitalSum {
    public static void sum(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        sum(num);
    }
}
