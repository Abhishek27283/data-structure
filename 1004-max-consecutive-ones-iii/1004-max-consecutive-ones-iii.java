class Solution {
    public int longestOnes(int[] nums, int k) {
       int left =0;
       int longest_one =0;
       int zero_count=0;
       for(int right =0;right<nums.length;right++){
        if(nums[right]==0) zero_count++;
        while(zero_count>k){
            if(nums[left]==0) zero_count--;
            left++;
        }
        longest_one = Math.max(longest_one,right-left+1);

       }
       return longest_one;
        
    }
}