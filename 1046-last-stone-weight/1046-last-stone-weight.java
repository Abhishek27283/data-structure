class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       int x,y;
       for(int i: stones){
        pq.offer(i);
       }
       while(pq.size()>1){
        y= pq.poll();
        x= pq.poll();
        if(y>x){
            pq.offer(y-x);
        }
       }
       return pq.isEmpty()?0:pq.poll();
    }
}