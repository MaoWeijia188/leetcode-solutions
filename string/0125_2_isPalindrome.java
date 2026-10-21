package leetcode-solutions.string;

public class 0125_2_isPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            // 左指针：找到第一个字母数字
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // 右指针：找到倒数第一个字母数字
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            // 转小写对比
            char lc = Character.toLowerCase(s.charAt(left));
            char rc = Character.toLowerCase(s.charAt(right));
            if(lc != rc){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/*
左右双指针
先找到第一个字母数字，再找倒数第一个字母数字，转小写对比
然后往中间移动
s.charAt(i) 取字符  
Character.toLowerCase(c)
*/
