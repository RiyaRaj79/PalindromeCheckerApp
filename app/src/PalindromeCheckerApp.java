import java.util.*;

// Palindrome Service Class (Encapsulation)
class PalindromeChecker {

    // Public method exposed to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize input (ignore spaces & case)
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Using two-pointer technique (Array internally)
        int left = 0;
        int right = processedInput.length() - 1;

        while (left < right) {
            if (processedInput.charAt(left) != processedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// Main Application Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}