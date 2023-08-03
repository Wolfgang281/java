import java.util.*;

public class NeonNumber {
    public static int square(int num) {
        return num * num;
    }

    public static void neon(int num) {
        int num1 = square(num);
        int temp = num1;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        if (sum == num)
            System.out.println(sum + " is a Neon number");
        else
            System.out.println(num + " is not a Neon number");

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        neon(num);
    }
}
