import java.util.Scanner;

class SpyNum {
    public static String spy(int num) {
        int sum = 0;
        int prod = 1;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }
        if (sum == prod) {
            return "spy";
        } else {
            return "not a spy";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(spy(num));
    }
}