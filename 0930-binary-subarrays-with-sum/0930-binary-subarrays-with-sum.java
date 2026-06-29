class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> total_occur = new HashMap<>();
        total_occur.put(0,1);
        int sum =0;
        int count =0;
         for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(total_occur.containsKey(sum-goal)){
                count+=total_occur.get(sum-goal);
            }
            total_occur.put(sum,total_occur.getOrDefault(sum,0)+1);
         }
         return count;
    }
}