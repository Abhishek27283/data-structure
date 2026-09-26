class Solution {
    private List<String> getValidParanthesis(String s,int open,int close,int n){
        List<String> result = new ArrayList<>();
        if(open==0 && close==0){
            result.add(s);
            return result;
        }
        if(open!=0 && open>0){
          result.addAll(getValidParanthesis(s+"(",open-1,close,n) ) ;
        }
        if(close!=0 && close>open){
           result.addAll( getValidParanthesis(s+")",open,close-1,n) ) ;
        }
        return result;
    }
    public List<String> generateParenthesis(int n) {
        return getValidParanthesis("",n,n,n);
    }
}