import java.util.*;

public class PalindromeCheckerApp {

    // Two-Pointer Approach
    public static boolean twoPointerCheck(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Stack-Based Approach
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque-Based Approach
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Performance Comparison ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        // Measure Two-Pointer
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(processed);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Measure Stack
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(processed);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Measure Deque
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(processed);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\n=== Results ===");
        System.out.println("Two-Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result:       " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Result:       " + result3 + " | Time: " + time3 + " ns");

        scanner.close();
    }
}
