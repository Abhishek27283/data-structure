class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> HMP = new HashMap<>();
        HashMap<Character,Integer> HMS = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(p.length()>s.length()) return res;
       
        for(int i=0;i<p.length();i++){
           char chs = s.charAt(i);
           char chp =p.charAt(i);
           HMP.put(chp,HMP.getOrDefault(chp,0)+1);

           HMS.put(chs,HMS.getOrDefault(chs,0)+1);
        }if(HMS.equals(HMP)) res.add(0);

        for(int j=p.length();j<s.length();j++){
            HMS.put(s.charAt(j),HMS.getOrDefault(s.charAt(j),0)+1);
            HMS.put(s.charAt(j-p.length()),HMS.getOrDefault(s.charAt(j-p.length()),0)-1);
            if(HMS.get(s.charAt(j-p.length()))==0) HMS.remove(s.charAt(j-p.length()));
            if(HMS.equals(HMP)) res.add(j-p.length()+1);
        }
        return res;
     
     }   
    }
