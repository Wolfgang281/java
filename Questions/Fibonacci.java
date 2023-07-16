import java.util.Scanner;

class Fibonacci {

    public static void fibonacci(int num, int x, int y) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i <= num; i++) {
            while (x > i && x <= y) {
                System.out.println(i);
            }
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        fibonacci(num, x, y);
    }
}
