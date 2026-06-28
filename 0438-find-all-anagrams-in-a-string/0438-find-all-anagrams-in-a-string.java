class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       ArrayList<Integer> res = new ArrayList<>();
       char[] chp = new char[26];
       char [] chs = new char [26];
       if(p.length()>s.length()) return res;
       for(int i =0;i<p.length();i++){
        chp[p.charAt(i)-'a']++;
        chs[s.charAt(i)-'a']++;
       }
       if(Arrays.equals(chp,chs)) res.add(0);
       
       for(int j =p.length();j<s.length();j++){
        chs[s.charAt(j-p.length())-'a']--;
        chs[s.charAt(j)-'a']++;
        if(Arrays.equals(chp,chs)) res.add(j-p.length()+1);
       }
       return res;
     
     }   
    }
