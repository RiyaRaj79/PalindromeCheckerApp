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
        boolean isPalindrome = true;

        // Iterate again through the original string
        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("input: " + input);
        System.out.println("is palindrome?: " + isPalindrome);
    }
}