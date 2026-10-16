# 栈与队列专题

## 核心知识点

- 栈的 LIFO 特性
- 队列的 FIFO 特性
- 括号匹配（栈的经典应用）
- 用栈实现队列、用队列实现栈（理解两种数据结构的转化）

## 刷题清单

### Easy

- [ ] [20. 有效的括号](https://leetcode.cn/problems/valid-parentheses/)
- [ ] [232. 用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks/)
- [ ] [225. 用队列实现栈](https://leetcode.cn/problems/implement-stack-using-queues/)
- [ ] [155. 最小栈](https://leetcode.cn/problems/min-stack/)

### Medium

- [ ] [150. 逆波兰表达式求值](https://leetcode.cn/problems/evaluate-reverse-polish-notation/)
- [ ] [946. 验证栈序列](https://leetcode.cn/problems/validate-stack-sequences/)

## 刷题顺序建议

1. **必先做 20（有效的括号）**—— 面试必考题
2. 然后 232、225 —— 理解栈和队列的转化原理
3. 155（最小栈）—— 辅助栈的思想
4. 最后挑战 150、946 —— Medium 难度

## 易错点

- 括号匹配要处理三种情况：左括号多余、右括号多余、类型不匹配
- 用栈实现队列需要两个栈（输入栈 + 输出栈）
- 最小栈需要维护一个辅助栈同步记录当前最小值
