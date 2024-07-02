package solutions.easy;

import java.util.Stack;

public class ValidParenthese {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) { // nếu chuỗi có số lẻ ký tự thì auto là sai
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || s.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(([]{}";
        String s3 = "((";
        String s4 = "{()}";
        String s5 = "()}{";
        String s6 = "([}}])";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
        System.out.println(isValid(s6));

    }
}
