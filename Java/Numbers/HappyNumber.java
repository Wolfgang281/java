import java.util.*;

public class HappyNumber {
    public static void happyNum(int num) {
        int temp = num;
        while (temp != 1 && temp != 4) {
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                sum += rem * rem;
                temp /= 10;
            }
            temp = sum;
        }
        if (temp == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        happyNum(a);
    }
}
