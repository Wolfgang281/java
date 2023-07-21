import java.util.Scanner;

public class PerfectSquare {
    static boolean b = false;

    public static void square(int num) {

        for (int i = 1; i < num / 2; i++) {
            if (i * i == num)
                b = true;
        }
        if (b)
            System.out.println("perfect number");
        else
            System.out.println("not a perfect number");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        square(num);
    }
}
