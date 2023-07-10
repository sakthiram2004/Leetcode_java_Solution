class Solution {
    public String addStrings(String num1, String num2) {
       
    int i = num1.length() - 1, j = num2.length() - 1;
    int carry = 0;
    StringBuilder res = new StringBuilder();
    while (i >= 0 || j >= 0) {
        int n1,n2;
        if( i >= 0 )
        n1= num1.charAt(i) - '0' ;
        else
        n1=0;
       if(j>=0)
        n2 =  num2.charAt(j) - '0' ;
        else
        n2= 0;
        int tempSum = n1 + n2 + carry;
        res.append(tempSum % 10);
        carry = tempSum / 10;
        i--;
        j--;
    }
    if (carry != 0) {
        res.append(carry);
    }
    return res.reverse().toString();


        
    }
}