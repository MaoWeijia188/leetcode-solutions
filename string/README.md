# 字符串专题

## 核心知识点

- 双指针翻转
- 字符频率统计（用数组或哈希表）
- 回文判定
- 子串查找

## 刷题清单

### Easy

- [ ] [14. 最长公共前缀](https://leetcode.cn/problems/longest-common-prefix/)
- [ ] [28. 实现 strStr()](https://leetcode.cn/problems/implement-strstr/)
- [ ] [125. 验证回文串](https://leetcode.cn/problems/valid-palindrome/)
- [ ] [242. 有效的字母异位词](https://leetcode.cn/problems/valid-anagram/)
- [ ] [344. 反转字符串](https://leetcode.cn/problems/reverse-string/)
- [ ] [387. 字符串中的第一个唯一字符](https://leetcode.cn/problems/first-unique-character-in-a-string/)

### Medium

- [ ] [5. 最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/)

## 刷题顺序建议

1. 先做 344（反转字符串）—— 双指针入门
2. 然后 125、242 —— 回文和字符频率
3. 14、387 —— 字符串遍历
4. 最后挑战 5（最长回文子串）—— 中心扩散法或 DP

## 易错点

- 字符串不可变，Java 中需要转成 char[] 再操作
- 大小写处理：回文题通常要忽略大小写
- 空字符串和单字符的边界情况
