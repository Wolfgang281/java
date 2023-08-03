import java.util.Scanner;

class SquareNumRange {
    public static void perfectRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            int temp = i;
            for (int j = 1; j <= temp; j++) {
                if (j * j == i)
                    System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        perfectRange(a, b);
    }
}