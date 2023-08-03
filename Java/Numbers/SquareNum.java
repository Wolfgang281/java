import java.util.Scanner;

public class SquareNum {
    public static void square(int num) {
        boolean b = false;
        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("perfect number");
        } else
            System.out.println("not a perfect number");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        square(num);
    }
}
