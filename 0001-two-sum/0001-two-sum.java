class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res = new HashMap<>();
        int [] op = new int[2];
        for(int i =0;i<nums.length;i++){
            if(res.containsKey(target-nums[i])){
               return new int []{res.get(target-nums[i]),i};
            }
            res.put(nums[i],res.getOrDefault(nums[i],i));
        }
        
       return op; 
    }
}