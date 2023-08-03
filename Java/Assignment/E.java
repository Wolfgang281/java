import java.util.*;

class EWallet {

    static int otpGenerated;
    static long mobileNumber;
    // static boolean isValidMobileNumber;

    public static int generateOtp() {
        Random r = new Random();
        otpGenerated = r.nextInt(9999);
        return otpGenerated;
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
            System.out.println("Validation Successful, Your Mobile Number is: " + mobileNumber);
            return true;
        }
    }

    public static boolean otpValidation() {
        Scanner s = new Scanner(System.in);
        if (validateMobileNumber()) {
            System.out.println("OTP sent to Your Mobile Number: " + mobileNumber);
            int otp = generateOtp();
            System.out.println("OTP is : " + otp);
            System.out.println("Enter OTP: ");
            int enteredOTP = s.nextInt();
            if (enteredOTP == otp) {
                System.out.println("OTP is Valid");
                return true;
            } else {
                System.out.println("OTP is Invalid");
                System.out.println("Enter Correct OTP: ");
                do {
                    System.out.println("Enter OTP: ");
                    enteredOTP = s.nextInt();
                } while (enteredOTP != otp);
                System.out.println("OTP is Valid");
                return true;
            }
        }
        return false;
    }

    public static void switchCase() {

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = s.next();
        otpValidation();
    }
}