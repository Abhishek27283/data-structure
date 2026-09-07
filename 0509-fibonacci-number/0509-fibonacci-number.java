class Solution {
    private int fibb(int n){
     if(n==0 || n==1)return n;

      return fibb(n-1)+fibb(n-2);
    }
    public int fib(int n) {
     return  fibb(n) ;
       
    }
}