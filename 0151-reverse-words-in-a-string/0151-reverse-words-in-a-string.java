class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        String res ="";
        for(int itr = str.length-1;itr>=0;itr-- ){
            res +=str[itr]+" ";
        }
        
        return res.trim();
    }
}