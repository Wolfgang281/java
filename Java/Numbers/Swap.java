import java.util.Scanner;

public class Swap {
    // using a temp variable
    public static void vary(int a, int b) {
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void add(int a, int b) {
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        vary(a, b);
        add(a, b);
    }
}
