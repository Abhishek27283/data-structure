class Solution {
    public int romanToInt(String s) {
       int count=0;
       for(int i=0;i<s.length()-1;i++){
        int first = getValue(s.charAt(i));
        int second = getValue(s.charAt(i+1));
        if(first<second){
            count-=first;
        }else{
            count+=first;
        }
       }
       return count+getValue(s.charAt(s.length()-1));
       
    }
    private int getValue(char c){
         if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return 0;
       }
}