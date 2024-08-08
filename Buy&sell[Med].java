//Brute Force Approach was to travel to each subarray where we will get max difference print ==> O(N)
//Optimal Approach is we will find the mini and subract with other element ==> O(N)

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int mini=prices[0];
        for(int i=1;i<prices.length;i++){
            if((prices[i]-mini)>maxProfit){
                maxProfit=prices[i]-mini;
            }
           if(mini>prices[i]){
            mini=prices[i];
           }
           
        }
        return maxProfit;
    }
}
