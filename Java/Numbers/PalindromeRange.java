import java.util.Scanner;

public class PalindromeRange {
    public static void palindrome(int a, int b) {
        for (int i = a; i <= b; i++) {
            int temp = i;
            int rev = 0;
            while (temp != 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            if (rev == i)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        palindrome(a, b);
    }
}
