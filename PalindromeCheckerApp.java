import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Stack Approach
    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){
            stack.push(c);
        }

        for(char c : input.toCharArray()){
            if(c != stack.pop()){
                return false;
            }
        }

        return true;
    }

    // Method 2: Deque Approach
    public static boolean dequePalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : input.toCharArray()){
            deque.add(c);
        }

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        // Stack timing
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endStack = System.nanoTime();

        long stackTime = endStack - startStack;

        // Deque timing
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long endDeque = System.nanoTime();

        long dequeTime = endDeque - startDeque;

        System.out.println("\nResults:");

        System.out.println("Stack Approach: " + 
                (stackResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time (Stack): " + stackTime + " ns");

        System.out.println("\nDeque Approach: " + 
                (dequeResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time (Deque): " + dequeTime + " ns");
    }
}