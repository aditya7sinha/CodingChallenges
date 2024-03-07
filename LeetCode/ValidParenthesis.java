package LeetCode;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if( c == '{' || c == '(' || c=='[')
                st.push(c);
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.peek();
                if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '['))
                    st.pop();
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
//        Stack<Character> stack = new Stack<Character>();
//        for(int i=0; i<s.length();i++) {
//            if(s.charAt(i) == '}' && stack.peek() != '{'){
//                return false;
//            }
//            else if (s.charAt(i) == ']' && stack.peek() != '[') {
//                return false;
//            }
//            else if (s.charAt(i) == ')' && stack.peek() != '(') {
//                return false;
//            }
//            else {
//                stack.push(s.charAt(i));
//            }
//        }
//        return ;
    }
    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String pattern = "()[]{}";
        System.out.println(validParenthesis.isValid(pattern));
    }
}
