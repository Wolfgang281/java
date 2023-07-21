//program to print 3rd num from a given number from fib series and also in range.

import java.util.Scanner;

class Fibonacci {
    public static int fib3(int m, int n) {
        int count = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for (; n3 <= n;) {
            if (n3 > m)
                count++;
            if (count == 3)
                return n3;
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(fib3(m, n));
    }
}