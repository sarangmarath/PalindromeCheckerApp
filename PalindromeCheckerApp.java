public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String original = "madam";

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        boolean isPalindrome = original.equals(reversed);

        System.out.println("String: " + original);
        System.out.println(isPalindrome);
    }
}
