class Solution {
    private void generateValidParanthesis(List<String>Result,String s, int open,int close){
        if(open==0 && close ==0){
            Result.add(s);
            return;
        }
        if(open!=0 && open>0){
            generateValidParanthesis(Result,s+"(",open-1,close);
        }
        if(close!=0 && close>open){
            generateValidParanthesis(Result,s+")",open,close-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> Result = new ArrayList<>();
        generateValidParanthesis(Result,"",n,n);
        return Result;


    }
}