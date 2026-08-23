class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
       
        long ab = lcm(a,b);
        long left = 0;
        long right = (long)n * Math.min(a,b);
        while(left<right){
            long mid = left +(right-left)/2;
            long count = mid/a
                        +mid/b
                        -mid/ab;
            if(count>=n){
                right = mid;
            }else {
                left = mid+1;
            }            
        }
        return (int)(left%1000000007);
        
    }
    private long lcm (long a, long b){
        return a/gcd(a,b)*b;
    }
    private long gcd (long a,long b){
        while(a!=0){
            long temp =a;
            a = b%a;
            b= temp;
             
        }
        return b;
    }
}