import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        // Compare front and rear elements
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        String input = sc.nextLine();

        // Check palindrome
        boolean result = isPalindrome(input);

        // Print result
        System.out.println("is palindrome? " + result);
    }
}