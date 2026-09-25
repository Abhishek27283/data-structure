class Solution {
    private double findpow(double x, int n){
        if(n==0) return 1;
        double half = findpow(x,n/2);
        if(n%2==0) return half*half;
        if(n<0){

        }
        return x*half*half;
    }
    public double myPow(double x, int n) {
        if(n<0){
            x = 1/x;
            n=-n;
        }
        return findpow(x,n);
    }
}