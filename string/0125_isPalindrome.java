class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String t = sb.toString();
        int l = 0, r = t.length()-1;
        while(l < r){
            if(t.charAt(l) != t.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
/*
1.StringBuilder的使用：
StringBuilder sb =new StringBuilder();
sb.append();
sb.toString();
2.java的增强for循环：
for(char c: s.toCharArray()){
    System.out.println(c);
}
3.常用的api：
Character.isLetterOrDigit(c)
Character.toLowerCase(c)
4.问题：
数组初始化要指定长度；
NULL是C语言写法，Java是null，而且 String 不能用下标判断 null；
字符要带单引号'';
题目漏看了数字；
*/