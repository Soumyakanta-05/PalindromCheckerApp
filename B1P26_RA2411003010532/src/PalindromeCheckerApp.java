import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArrimport java.util.Scanner;

        public class PalindromeCheckerApp {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Input : ");
                String input = sc.nextLine();
                String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                boolean isPalindrome = true;
                for (int i = 0; i < normalized.length() / 2; i++) {

                    if (normalized.charAt(i) !=
                            normalized.charAt(normalized.length() - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);

                sc.close();
            }
        }ay()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}