public class PalindromeCheckerApp{
        public static void main(String[] args) {
            String text = "madam";
            String reversed = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed = reversed + text.charAt(i);
            }
            if (text.equals(reversed)) {
                System.out.println("Input text: " + text);
                System.out.println("Is it Palindrome? : true");
            } else {
                System.out.println("Input text: " + text);
                System.out.println("Is it Palindrome? : false");
            }
        }

}
