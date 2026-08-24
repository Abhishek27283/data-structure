class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;){
            int correct_index =nums[i];
            if(nums[correct_index]!=nums[i]){
                int temp =nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }else i++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i) return nums[i];
        }
        return -1;
    }
}