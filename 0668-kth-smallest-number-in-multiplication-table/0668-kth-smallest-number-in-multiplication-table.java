class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low =1;
        int high = m*n;
        while(low<high){
            int mid = low + (high-low)/2;
            int count =0;

            for(int i =1;i<=Math.max(m,n);i++){
                count+=Math.min(Math.min(n,m),mid/i);
            }
            if(count>=k) high = mid;
            else low =mid+1;
        }
        return low;
        
    }
}