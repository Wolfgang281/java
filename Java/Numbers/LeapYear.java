import java.util.Scanner;

public class LeapYear {
    public static void leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else
            System.out.println("not a leap year");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        leapYear(year);
    }
}
