# 哈希表专题

## 核心知识点

- 哈希表的 O(1) 查找特性
- 空间换时间思想
- 计数、查重、分组三大应用场景

## 刷题清单

### Easy

- [ ] [217. 存在重复元素](https://leetcode.cn/problems/contains-duplicate/)
- [ ] [349. 两个数组的交集](https://leetcode.cn/problems/intersection-of-two-arrays/)
- [ ] [350. 两个数组的交集 II](https://leetcode.cn/problems/intersection-of-two-arrays-ii/)
- [ ] [383. 赎金信](https://leetcode.cn/problems/ransom-note/)

### Medium

- [ ] [49. 字母异位词分组](https://leetcode.cn/problems/group-anagrams/)
- [ ] [128. 最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence/)

## 刷题顺序建议

1. 先做 217、349、350 —— 基础查重和交集
2. 383 —— 字符频率计数
3. 最后挑战 49（分组）、128（最长连续序列）—— Medium 难度

## 易错点

- 哈希表的选择：数组（键范围小）vs HashSet（去重）vs HashMap（键值对）
- 49 题的 key 设计：排序后的字符串作为 key
- 128 题的优化：只从序列起点开始向后查，跳过非起点
