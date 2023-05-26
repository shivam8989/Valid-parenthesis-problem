package Stack;
import java.util.Stack;
public class Valid_Parentheses {
    public static boolean isValid(String str) {
        Stack<Character> list = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                list.push(ch);
            } else {
                if (list.isEmpty()) {
                    return false;
                }
                if ((list.peek() == '(' && ch == ')') || (list.peek() == '{' && ch == '}') || (list.peek() == '[' && ch == ']')) {
                    return true;
                } else {
                    return false;
                }
            }
        }

                if (list.isEmpty()) {
                    return true;
                } else {
                    return false;
                }
            }

    public static void main(String args []){
         String str = "({})[]";
        System.out.println(isValid(str));
    }

}
