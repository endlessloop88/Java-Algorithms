import java.util.Stack;


class Solution {
    public boolean isValid(String s) {
        Stack<Character> yigin = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                yigin.push(c);
            } 
            else {
                if (yigin.isEmpty()) {
                    return false;
                }
                
                char sonAcilan = yigin.pop();
                
                if (c == ')' && sonAcilan != '(') return false;
                if (c == '}' && sonAcilan != '{') return false;
                if (c == ']' && sonAcilan != '[') return false;
            }
        }
        
        return yigin.isEmpty();
    }
}
