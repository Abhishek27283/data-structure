class Solution {
    private void validCombine(int start , int n,int k,ArrayList<Integer>combi,List<List<Integer>>result){
        if(combi.size()==k){
            result.add(new ArrayList<>(combi));
            return;
        }
        for(int num = start;num<=n;num++){
            combi.add(num);
            validCombine(num+1,n,k,combi,result);
            combi.remove(combi.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> store = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        validCombine(1,n,k,store,res);
        return res;
        
    }
}