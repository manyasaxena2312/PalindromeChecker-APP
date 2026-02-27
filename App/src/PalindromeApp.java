public class PalindromeApp {
    static void main() {
    import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

        public class UseCase7PalindromeCheckerApp {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Deque<Character> deque = new LinkedList<>();

                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                for (int i = 0; i < input.length(); i++) {
                    deque.addLast(input.charAt(i));
                }

                boolean isPalindrome = true;

                while (deque.size() > 1) {
                    if (!deque.removeFirst().equals(deque.removeLast())) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("The given string is a palindrome.");
                } else {
                    System.out.println("The given string is not a palindrome.");
                }

                scanner.close();
            }
        }
    }
}
