import java.util.*;

public class LeapYearRange {
    public static void leapYear(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.printf("leap year %d ", i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        leapYear(a, b);
    }
}
