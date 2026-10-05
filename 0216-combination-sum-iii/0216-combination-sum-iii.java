class Solution {
    private void getCombinationSum(int start, int k, int n,List<Integer> combi,List<List<Integer>>result){
        if(combi.size()==k){
            if(n==0)
            result.add(new ArrayList<>(combi));
            return;
        }
       

        for(int i = start;i<=9;i++){
            if(i>n){
                break;
            }
            combi.add(i);
           getCombinationSum(i+1,k,n-i,combi,result) ;
           combi.remove(combi.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> store = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        getCombinationSum(1,k,n,store,result);

        return result;
        
    }
}