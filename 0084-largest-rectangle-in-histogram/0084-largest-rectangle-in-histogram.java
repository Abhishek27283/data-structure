class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max_area =0;
        int n = heights.length;
        for(int i =0;i<=n;i++){
            int curr_value = (i==n)?0:heights[i];
            while(!st.isEmpty() && curr_value<= heights[st.peek()]){
                int heig = heights[st.pop()];
                int left = st.isEmpty()?-1:st.peek();
                int right = i;
                max_area = Math.max(max_area,heig*(right-left-1));
            }
            st.push(i);
        }
        return max_area;
        
    }
}