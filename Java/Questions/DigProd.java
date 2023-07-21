import java.util.Scanner;

public class DigProd {
    public void digProd(int num) {
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
        int a = s.nextInt();
        DigProd d = new DigProd();
        d.digProd(a);
    }
}
