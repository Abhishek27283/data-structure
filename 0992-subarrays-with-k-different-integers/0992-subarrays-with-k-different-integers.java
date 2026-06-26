class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return findDistinct(nums,k)-findDistinct(nums,k-1);
    }
    private int findDistinct(int[]nums,int k){
      HashMap<Integer,Integer> unique= new HashMap<>();
      int ans =0;
      int left=0;
      for(int right =0;right<nums.length;right++){
        unique.put(nums[right],unique.getOrDefault(nums[right],0)+1);
        while(unique.size()>k){
            unique.put(nums[left],unique.getOrDefault(nums[left],0)-1);
            if(unique.get(nums[left])==0)
            unique.remove(nums[left]);
            left++;  
        }
        ans += right-left+1;
      }
      return ans;
    }
}