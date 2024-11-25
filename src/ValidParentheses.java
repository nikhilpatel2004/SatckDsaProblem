
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // opening
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && c == ')') // ()
                        || (s.peek() == '{' && c == '}') // {}
                        || (s.peek() == '[' && c == ']')) { // []
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({})[]"; // true
        System.out.println(isValid(str));
    }
}

