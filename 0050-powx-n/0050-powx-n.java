class Solution {
    private double power(double x, long n){
        if(n==0) return 1;
        double half = power(x,n/2);
       if(n%2==0) 
       return half*half;
       return x*half*half;
    }
    public double myPow(double x, int n) {
        if(n<0){
            x = 1/x;
            n=-n;
        }
        return power( x, (long) n);

    }
}