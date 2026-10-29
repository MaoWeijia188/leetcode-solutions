package leetcode-solutions.stack_queue;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // 左括号入栈
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // 右括号，栈空直接失败
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        // 全部匹配完栈要空
        return stack.isEmpty();
    }
}

