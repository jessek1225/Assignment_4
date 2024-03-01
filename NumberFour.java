import java.util.Stack;

public class NumberFour {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isBalanced(s));
    }

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (letter == '{' || letter == '[' || letter == '(') {
                stack.push(letter); // Push opening brackets onto the stack
            } else {
                // Check if the stack is empty (no matching opening bracket)
                if (stack.isEmpty()) {
                    return "NO";
                }

                // Retrieve the top of the stack
                char top = stack.pop();

                // Check if the current closing bracket matches with the top of the stack
                if ((letter == '}' && top != '{') ||
                        (letter == ']' && top != '[') ||
                        (letter == ')' && top != '(')) {
                    return "NO"; // Mismatched brackets
                }
            }
        }

        // Check if there are any unmatched opening brackets remaining in the stack
        if (!stack.isEmpty()) {
            return "NO";
        }

        return "YES"; // All brackets matched
    }
}
