public class PalindromeCheckerApp{
    public static void main(String[] args) {

        String word = "madam";

        String reversed = new StringBuilder(word).reverse().toString();

        boolean isPalindrome = word.equals(reversed);
        System.out.println("Input text: "+word);
        System.out.println("Is it a Palindrome? "+isPalindrome);
    }
}
