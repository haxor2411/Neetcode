package Stack;

import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int oB = 0, cB = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                oB++;
            }
            else {
                cB++;
                if(cB > oB) return false;
                if(ch == ')' && stack.peek() == '(') stack.pop();
                else if(ch == '}' && stack.peek() == '{') stack.pop();
                else if(ch == ']' && stack.peek() == '[') stack.pop();

            }
        }

        return stack.isEmpty();
    }
}
