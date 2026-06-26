class Solution {
    public int lengthOfLongestSubstring(String s) {
     
     HashSet<Character> unique_ele = new HashSet<>();
     int longestSub =0;
     int left =0;
     for(int right =0;right<s.length();right++){
        while(unique_ele.contains(s.charAt(right))){
            unique_ele.remove(s.charAt(left));
            left++;
        }
        longestSub = Math.max(longestSub,right-left+1);
        unique_ele.add(s.charAt(right));

     }
     return longestSub;
    }
}