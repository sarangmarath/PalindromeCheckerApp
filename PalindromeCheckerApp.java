import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String input = "civic";

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);     // Enqueue operation
            stack.push(c);    // Push operation
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue operation
            char fromStack = stack.pop();     // Pop operation

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}