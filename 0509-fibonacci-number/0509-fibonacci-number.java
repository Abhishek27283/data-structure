class Solution {
    private int findfib(int n){
        if(n==0||n==1) return n;

        return findfib(n-1)+ findfib(n-2);
    }
    public int fib(int n) {
       return findfib(n) ;
    }
}