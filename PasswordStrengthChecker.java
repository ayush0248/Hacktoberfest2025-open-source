import java.util.Scanner;

public class PasswordStrengthChecker {

    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password to check: ");
        String password = scanner.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("✅ Strong password!");
        } else {
            System.out.println("❌ Weak password. Use at least 8 characters, including uppercase, lowercase, digits, and special symbols.");
        }

        scanner.close();
    }
}
