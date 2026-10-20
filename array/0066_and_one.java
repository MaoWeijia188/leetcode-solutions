public class 0066_and_one {
    public int[] plusOne(int[] digits) {
    int carry=0;
    int l=digits.length-1;
    int and=digits[l]+1;
    if(and==10){
        digits[l]=0;
        carry=1;
      }else{
        digits[l]++;
        return digits;
      }
    for(int i=1;i<digits.length;i++){
      l=digits.length-1-i;
      and=digits[l]+carry;
      if(and==10){
        digits[l]=0;
        carry=1;
      }else{
        digits[l]++;
        return digits;
      }
        }
        int []digitss=new int[digits.length+1];
        digitss[0]=1;
        for(int k=1;k<digits.length+1;k++){
            digitss[k]=0;
        }
        return digitss;
    }
}
/*
开始错误地使用了一个转化成整数加一再转化回去的方法，
没有注意到题干的细节：整数超出了long的范围，会溢出；
java没有**的幂运算符，正确的是Math.pow(),
而且返回的数是double类型，有精度问题。

*/
