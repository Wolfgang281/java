import java.util.Scanner;

class FibSeries {

    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        fibonacci(num);
    }
}
