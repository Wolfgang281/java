
import java.util.Scanner;

class Fib2 {
    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        // if (count == 2)
        // return true;
        // else
        // return false;
        return (count == 2);
    }

    public static int fib3(int m) {
        int count = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        while (true) {
            if (n3 > m && isPrime(n3)) {
                count++;
            }
            if (count == 3)
                return n3;
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        // System.out.println(fib3(m));
        String str = "2018";
        int a = Integer.parseInt(str);
        System.out.println(a);
    }
}