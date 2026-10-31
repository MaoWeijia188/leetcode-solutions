package leetcode-solutions.stack_queue;

import java.util.Stack;

class MyQueue {
    // in栈：专门用来接收新元素（push）
    Stack<Integer> inStack;
    // out栈：专门用来弹出、取队首（pop/peek）
    Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // 入队：直接压进inStack
    public void push(int x) {
        inStack.push(x);
    }

    // 出队：删除并返回队头
    public int pop() {
        transfer();
        return outStack.pop();
    }

    // 获取队头元素（不删除）
    public int peek() {
        transfer();
        return outStack.peek();
    }

    // 判断队列是否为空
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // 核心方法：out栈空的时候，把in栈全部转移到out栈
    private void transfer() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
