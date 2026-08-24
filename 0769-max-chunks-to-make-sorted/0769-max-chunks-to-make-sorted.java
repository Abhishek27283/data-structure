class Solution {
    public int maxChunksToSorted(int[] arr) {
        int index_sum=0;
        int element_sum =0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            index_sum+=i;
            element_sum+=arr[i];
            if(index_sum==element_sum) count++;
        }
        return count;
        
    }
}