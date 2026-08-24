class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        char [] S1 = new char[26];
        char [] S2 = new char[26];
        for(int i=0;i<s1.length();i++){
            S1[s1.charAt(i)-'a']++;
            S2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(S1,S2)) return true;

        for(int i=s1.length();i<s2.length();i++){
            S2[s2.charAt(i-s1.length())-'a']--;
            S2[s2.charAt(i)-'a']++;
            if(Arrays.equals(S1,S2)) return true;
        }
        return false;
    }
}