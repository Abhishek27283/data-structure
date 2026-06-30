class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max_Area =0;
        while(left<right){
            int breadth = right-left;
            int min_elem = Math.min(height[left],height[right]);
            max_Area = Math.max(max_Area,min_elem*breadth);  
            if(height[left]<height[right]) left++;
            else right--;
        }  
        return max_Area;   
    }
}