import java.util.Scanner;
import java.util.Random;

class Account {
    static String name;
    static int otpGenerated;
    static int amount;

    public static int otpGenerate() {
        Random r = new Random();
        otpGenerated = r.nextInt(9999);
        return otpGenerated;
    }

    public static boolean checkBalance(int balance, int amount) {
        if (balance >= amount) {
            return true;
        } else if (balance == 0) {
            return false;
        } else {
            return false;
        }
    }

    public static void withdraw(int balance) {
        Scanner s = new Scanner(System.in);
        char choice = 'y';
        do {
            System.out.print("Enter the amount to be withdrawn:\n");
            int amount = s.nextInt();
            System.out.println("OTP is : " + otpGenerate());
            System.out.print("Enter OTP: ");
            int enteredOTP = s.nextInt();
            if (enteredOTP == otpGenerated) {
                if (checkBalance(balance, amount)) {
                    balance -= amount;
                    System.out.println();
                    System.out.println("\tName : " + name);
                    System.out.println("\tRupees " + amount + " Successfully withdrawn.");
                    System.out.println("\tTotal Balance: " + balance + " Rs.");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("\tInsufficient Balance");
                    System.out.println("\tWithdrawal Failed.");
                    System.out.println("\tBalance: " + balance + " Rs.");

                    System.out.println();
                }
            } else {
                System.out.println();
                System.out.println("\tWrong OTP");
                System.out.println("\tPlease try again");
                System.out.println();
            }
            System.out.println("Press y or Y for another withdrawal\nPress n or N to exit");
            choice = s.next().charAt(0);
            if (balance == 0) {
                System.out.println("insufficient balance");
                break;
            }
        } while (choice == 'Y' || choice == 'y');
        System.out.println("\tThank You");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Name: \n");
        name = s.next();
        // System.out.println("OTP is : " + otpGenerate());
        System.out.print("Enter the total balance:\n");
        int balance = s.nextInt();
        withdraw(balance);
    }
}