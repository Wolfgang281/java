import java.util.Scanner;

public class DigitalProduct {
    public static void product(int num) {
        int temp = num;
        int prod = 1;
        while (temp != 0) {
            int rem = temp % 10;
            prod *= rem;
            temp /= 10;
        }
        System.out.println(prod);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        product(num);
    }
}
