import java.util.Scanner;

class LeapYear {
    public static void leap(int m, int n) {
        for (int i = m; i <= n; i++) {
            int year = i;
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
                System.out.println(year);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        leap(m, n);
    }
}