// initial creating 2 arrays so space complexity will be O(N2);
// Now we took only 1 extra array and by using two pointer we iterate  space ==O(N); 

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int lengths=nums.length;
        int[] ans=new int[lengths];
        int positive=0;
        int negative=1;
        for(int i=0;i<lengths;i++){
            if(nums[i]>=0){
                ans[positive]=nums[i];
                positive=positive+2;
            }
            if(nums[i]<0){
                ans[negative]=nums[i];
                negative=negative+2;
            }
        }
        return ans;

         
     }
}
