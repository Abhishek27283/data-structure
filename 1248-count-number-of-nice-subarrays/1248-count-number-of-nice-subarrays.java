class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
       hs.put(0,1);
       int count =0;
       int sum =0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0) sum+=0;
        else sum+=1;
        if(hs.containsKey(sum-k)) count+=hs.get(sum-k);
        hs.put(sum,hs.getOrDefault((sum),0)+1);
       }
       return count;
    }
}