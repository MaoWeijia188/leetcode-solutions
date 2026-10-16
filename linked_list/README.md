# 链表专题

## 核心知识点

- 指针操作（next 的指向）
- 虚拟头节点（dummy head）简化边界处理
- 快慢指针（找中点、判环、找倒数第 N 个）

## 刷题清单

### Easy

- [ ] [21. 合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/)
- [ ] [83. 删除排序链表中的重复元素](https://leetcode.cn/problems/remove-duplicates-from-sorted-list/)
- [ ] [141. 环形链表](https://leetcode.cn/problems/linked-list-cycle/)
- [ ] [160. 相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/)
- [ ] [203. 移除链表元素](https://leetcode.cn/problems/remove-linked-list-elements/)
- [ ] [206. 反转链表](https://leetcode.cn/problems/reverse-linked-list/)
- [ ] [234. 回文链表](https://leetcode.cn/problems/palindrome-linked-list/)
- [ ] [237. 删除链表中的节点](https://leetcode.cn/problems/delete-node-in-a-linked-list/)

### Medium

- [ ] [2. 两数相加](https://leetcode.cn/problems/add-two-numbers/)
- [ ] [19. 删除链表的倒数第 N 个节点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/)
- [ ] [24. 两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/)
- [ ] [142. 环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/)

## 刷题顺序建议

1. **必先做 206（反转链表）**—— 面试最高频，不会反转链表等于没学过链表
2. 然后 21、83 —— 合并与去重，巩固指针操作
3. 141、160 —— 快慢指针的应用
4. 203、234、237 —— 综合练习
5. 最后挑战 Medium：19（双指针）、2（模拟加法）、142（数学推导）

## 易错点

- 反转链表时忘记保存 next 指针，导致链表断裂
- 用虚拟头节点可以避免头节点特殊处理
- 判环的快慢指针相遇后，找入口需要数学推导（142 题）
