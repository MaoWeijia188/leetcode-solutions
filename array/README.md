# 数组专题

## 核心知识点

- 数组遍历与边界处理
- 双指针技巧（对撞指针、快慢指针）
- 前缀和
- 原地修改（不开额外空间）

## 刷题清单

### Easy

- [ ] [1. 两数之和](https://leetcode.cn/problems/two-sum/)
- [ ] [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
- [ ] [27. 移除元素](https://leetcode.cn/problems/remove-element/)
- [ ] [66. 加一](https://leetcode.cn/problems/plus-one/)
- [ ] [88. 合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/)
- [ ] [121. 买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/)
- [ ] [136. 只出现一次的数字](https://leetcode.cn/problems/single-number/)
- [ ] [169. 多数元素](https://leetcode.cn/problems/majority-element/)
- [ ] [283. 移动零](https://leetcode.cn/problems/move-zeroes/)
- [ ] [448. 找到所有数组中消失的数字](https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/)

### Medium

- [ ] [11. 盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/)
- [ ] [15. 三数之和](https://leetcode.cn/problems/3sum/)

## 刷题顺序建议

1. 先做 1（两数之和）—— 哈希表的入门
2. 再做 26、27、283 —— 双指针原地修改的三连题
3. 然后 88、66 —— 数组操作基础
4. 121、136、169 —— 单次遍历的套路
5. 最后挑战 11、15 —— Medium 难度的双指针

## 易错点

- 边界条件：`left < right` 还是 `left <= right`
- 数组下标越界：访问 `nums[i+1]` 前检查 `i+1 < len`
- 修改原数组时，注意指针的移动方向
