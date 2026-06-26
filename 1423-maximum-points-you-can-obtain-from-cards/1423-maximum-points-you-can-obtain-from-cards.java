class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int sum =0,maxsum =0;
    for(int i=0;i<k;i++){
        sum+=cardPoints[i];
    }
    maxsum =sum;
    for(int i=0;i<k;i++){
        sum-=cardPoints[k-i-1];
        sum+=cardPoints[cardPoints.length-i-1];
        maxsum = Math.max(maxsum,sum);
    }
    return maxsum;
    }
}