class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> pq = new LinkedList<>();
        for(int i=0;i<tickets.length;i++) pq.offer(i);

        int timeTaken =0;
        while(!pq.isEmpty()){
            timeTaken++;
            int frontIndex = pq.peek();
            pq.poll();
            tickets[frontIndex]--;
            if(frontIndex==k && tickets[frontIndex] ==0 ) return timeTaken;
            if(tickets[frontIndex]!=0) pq.offer(frontIndex);
        }
        return timeTaken;
        
    }
}