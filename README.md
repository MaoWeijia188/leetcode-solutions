# leetcode-solutions
LeetCode刷题记录，包含题目思路、代码、复盘总结，Java实现
# 🧩 LeetCode Notes
> LeetCode 刷题记录，Java 题解，记录思路、复杂度、踩坑复盘，持续更新。

## 📊 刷题进度
- Easy：0
- Medium：0
- Hard：0
- 合计：0

## 📂 题型目录
- [数组](./数组/)
- [链表](./链表/)
- [哈希表](./哈希表/)
- [字符串](./字符串/)
- [栈与队列](./栈与队列/)
- [树](./树/)
- [回溯](./回溯/)
- [动态规划](./动态规划/)
- [贪心](./贪心/)
- [图论](./图论/)

## 📝 单题笔记模板
文件名规范：`LC题号_题目名称.md`，例：`LC001_两数之和.md`

> 模板内容：
# LC001 两数之和
难度：Easy
原题链接：https://leetcode.cn/problems/two-sum/

### 题目简述
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。

### 解题思路
使用哈希表，遍历数组，每次检查 `target - nums[i]` 是否存在哈希表中。
- 时间复杂度：O(n)
- 空间复杂度：O(n)

### Java 代码
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    }
}
