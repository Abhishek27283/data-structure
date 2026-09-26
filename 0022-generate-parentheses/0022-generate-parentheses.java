class Solution {
    private void getValidParanthesis(List<String>result ,String s,int open,int close,int n){
        if(open==0 && close==0){
            result.add(s);
            return ;
        }
        if(open!=0 && open>0){
          getValidParanthesis(result,s+"(",open-1,close,n)  ;
        }
        if(close!=0 && close>open){
           getValidParanthesis(result,s+")",open,close-1,n)  ;
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> result =new ArrayList<>();
        getValidParanthesis(result,"",n,n,n);
        return result;

    }
}