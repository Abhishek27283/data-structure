class Solution {
    private boolean powOfTwo(int n){
        if(n==1) return true;
        if(n%2!=0) return false;
        if(n<=0) return false;
      return  powOfTwo(n/2);
    }
    public boolean isPowerOfTwo(int n) {
       return powOfTwo(n);
    }
}