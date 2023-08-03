import java.util.*;

class EWallet {

    static String name;
    static int otpGenerated;
    static long mobileNumber;
    static int balance;
    // static boolean isValidMobileNumber;

    public static int generateOtp() {
        Random r = new Random();
        otpGenerated = r.nextInt(9999);
        return otpGenerated;
    }

    public static boolean checkBalance(int balance, int amount) {
        if (balance >= amount) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateMobileNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Mobile Number: ");
        mobileNumber = s.nextLong();
        long temp = mobileNumber;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        if (count == 10) {
            System.out.println("Validation Successful, Your Mobile Number is: " + mobileNumber);
            return true;
        } else {
            do {
                System.out.println("Enter Valid Mobile Number");
                System.out.println("Enter Your Mobile Number Again: ");
                mobileNumber = s.nextLong();
                count = 0;
                temp = mobileNumber;
                while (temp != 0) {
                    count++;
                    temp = temp / 10;
                }
            } while (count != 10);
            System.out.println("\tValidation Successful, Your Mobile Number is: " + mobileNumber);
            System.out.println();
            return true;
        }
    }

    public static boolean otpValidation() {
        Scanner s = new Scanner(System.in);
        if (validateMobileNumber()) {
            System.out.println("\tOTP sent to Your Mobile Number: " + mobileNumber);
            System.out.println();
            int otp = generateOtp();
            System.out.println("OTP is : " + otp);
            System.out.println("Enter OTP: ");
            int enteredOTP = s.nextInt();
            if (enteredOTP == otp) {
                System.out.println("OTP is Valid");
                System.out.println();
                return true;
            } else {
                System.out.println("OTP is Invalid");
                System.out.println("Enter Correct OTP: ");
                do {
                    System.out.println("Enter OTP: ");
                    enteredOTP = s.nextInt();
                } while (enteredOTP != otp);
                System.out.println("OTP is Valid");
                System.out.println();
                return true;
            }
        }
        return false;
    }

    public static void withdraw() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int amount = s.nextInt();
        int otp = generateOtp();
        System.out.println("OTP is : " + otp);
        System.out.println("Enter OTP: ");
        int enteredOTP = s.nextInt();
        if (enteredOTP == otp) {
            if (checkBalance(balance, amount)) {
                balance -= amount;
                System.out.println();
                System.out.println("\tName : " + name);
                System.out.println("\tMobile Number : " + mobileNumber);
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
            System.out.println("Wrong OTP");
            System.out.println("Please try again");
            System.out.println();
        }
    }

    public static void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.println("\tEnter the amount to deposit");
        int depositAmount = s.nextInt();
        int otp = generateOtp();
        System.out.println("\tOTP is : " + otp);
        System.out.println("\tEnter OTP: ");
        int enteredOTP = s.nextInt();
        if (enteredOTP == otp) {
            balance += depositAmount;
            System.out.println("\tName : " + name);
            System.out.println("\tMobile Number : " + mobileNumber);
            System.out.println("\tDeposit Successful");
            System.out.println("\tBalance is : " + balance);
            System.out.println();
        } else {
            System.out.println("Wrong OTP");
            System.out.println("Please try again");
            System.out.println();
        }
    }

    public static void displayBalance() {
        Scanner s = new Scanner(System.in);
        int otp = generateOtp();
        System.out.println("OTP is : " + otp);
        System.out.println("Enter OTP: ");
        int enteredOTP = s.nextInt();
        if (enteredOTP == otp) {
            System.out.println("\tName : " + name);
            System.out.println("\tMobile Number : " + mobileNumber);
            System.out.println("\tBalance is : " + balance);
            System.out.println();
        } else {
            System.out.println("\tWrong OTP");
            System.out.println("\tPlease try again");
            System.out.println();
        }
    }

    public static void switchCase() {
        int choice = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println(
                    "\tEnter 1 for Withdrawal\n\tEnter 2 for Deposit\n\tEnter 3 to display Balance\n\tEnter 4 to exit");
            System.out.println("Enter your choice");
            choice = s.nextInt();
            switch (choice) {
                case 1: {
                    withdraw();
                    break;
                }
                case 2: {
                    deposit();
                    break;
                }
                case 3: {
                    displayBalance();
                    break;
                }
                case 4: {
                    System.out.println("Thank You");
                    break;
                }
                default: {
                    System.out.println("Invalid Choice");
                }
            }
            System.out.println();
        } while (choice != 4);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name = s.next();
        if (otpValidation()) {
            switchCase();
        }

    }
}