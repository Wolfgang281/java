import java.util.Scanner;

public class Fibonacci {
    public static void fib(int num) {
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        fib(a);
    }
}
