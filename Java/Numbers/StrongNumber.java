import java.util.Scanner;

public class StrongNumber {
    public static void strongNumber(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == num)
            System.out.println("Strong number");
        else
            System.out.println("Not a Strong Number");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        strongNumber(num);
    }
}