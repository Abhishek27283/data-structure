class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return findDistinct(nums,k)-findDistinct(nums,k-1);
    }
    private int findDistinct(int[]nums,int k){
      int [] unique = new int[nums.length+1];
      int ans =0;
      int left=0;
      int distinct =0;
      for(int right =0;right<nums.length;right++){
        unique[nums[right]]++;
        if(unique[nums[right]]==1) distinct++;
        while(distinct>k){
            unique[nums[left]]--;
            if(unique[nums[left]]==0)
            distinct--;
            left++;  
        }
        ans += right-left+1;
      }
      return ans;
    }
}