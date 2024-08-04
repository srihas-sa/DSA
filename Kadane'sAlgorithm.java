//Max sum of subarray initially used 2 for loop it is not the optimal approach it takes O(N2) Time Complexity
//2nd Approsach will be Kadener's Algo where we check if sum become less than 0 then we assign it to 0,if sum>maxi then we update the new max


class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=-111111;
        int sum=0;
        for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];
          if(sum>maxi){
            maxi=sum;
          
        }
        if(sum<0){
          sum=0;
        }
        }
        return maxi;
    }
}
