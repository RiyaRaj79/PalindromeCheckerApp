import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through the original string
        for (char c : input.toCharArray()) {
            // Pop from stack and compare with current character
            if (stack.pop() != c) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        System.out.println("input: " + input);
        System.out.println("is palindrome?: " + isPalindrome);
    }
}