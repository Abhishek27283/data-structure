class Solution {
    private void revString(char[]s , int left,int right){
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public void reverseString(char[] s) {
       revString(s,0,s.length-1) ;
    }
}