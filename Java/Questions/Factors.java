import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(num);
    }
}
