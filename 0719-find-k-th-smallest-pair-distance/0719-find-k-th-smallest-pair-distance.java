class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0;
        int right = nums[nums.length-1]- nums[0];
        while(left<right){
            int mid = left + (right-left)/2;
            int count = numsOfPairlessK(nums,mid);
            if(count<k){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;    
        
    }
    private int numsOfPairlessK(int[]nums,int distance){
            int left =0;
            int count =0;
            for(int right =0;right<nums.length;right++){
                while(nums[right]-nums[left]>distance) {
                    left++;
                }
                count+=right-left;
            }
            return count;
        }
}