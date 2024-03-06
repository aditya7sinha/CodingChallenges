package LeetCode;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
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
