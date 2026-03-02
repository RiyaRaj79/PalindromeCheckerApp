public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Input string
        String input = "radar";

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Initialize pointers
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output
        System.out.println("input: " + input);
        System.out.println("is palindrome?: " + isPalindrome);
    }
}
