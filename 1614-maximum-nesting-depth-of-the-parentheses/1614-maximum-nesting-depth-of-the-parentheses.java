class Solution {
    public int maxDepth(String s) {
        int final_count =0;
        int count =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                final_count = Math.max(final_count,count);
            }else{
                if(s.charAt(i)==')'){
                    count--;
                }
            }
        }
        return final_count;
        
    }
}