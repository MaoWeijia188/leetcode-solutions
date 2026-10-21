package leetcode-solutions.string;

public class 0344_updown_string {
    public void reverseString(char[] s) {
        int t=s.length/2;
        for(int i=0;i<t;i++){
            char temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
        System.out.println(s);
    }
}
