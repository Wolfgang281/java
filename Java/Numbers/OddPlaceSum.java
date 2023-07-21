import java.util.Scanner;

class OddPlaceSum {
    public static int reverse(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        return rev;
    }

    public static void oddSum(int num) {
        int temp = reverse(num);
        System.out.println(temp);
        int count = 0;
        int sum = 0;
        while (temp != 0) {
            count++;
            int rem = temp % 10;
            if (count % 2 == 1) {
                sum += rem;
            }
            temp /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        oddSum(num);
    }
}
