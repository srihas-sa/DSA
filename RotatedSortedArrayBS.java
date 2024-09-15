// Rotated Sorted Array1

class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=(nums.length)-1;
        int index=-1;
        while(left <= right){
                int mid=(left+right)/2;

                if(nums[mid]==target){
                    index=mid;
                    break;
                }
                else if((nums[left]<=nums[mid]) && ((nums[left]<=target) && (target <=nums[mid]))){
                right=mid-1;
            }
            else if(nums[left]<=nums[mid]) {
               left=mid+1;
            }
            else if((nums[mid]<=nums[right]) && ((nums[mid]<=target) && (target <=nums[right]))) {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
        return index;
    }
}

//Rotated Sorted Array 2(repeated Values}  here {1,0,1,1,1} Here at left,right same index so error occurs so we need to modify code
class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=(nums.length)-1;
        while(left <= right){
            if((nums[left]==target) || (nums[right]==target)){
                return true;
            }
            
            if(nums[left]==nums[right]){
                left=left+1;
                right=right-1;
            }
            else{
                int mid=(left+right)/2;

                if(nums[mid]==target){
                    return true;
                }
                else if((nums[left]<=nums[mid]) && ((nums[left]<=target) && (target <=nums[mid]))){
                right=mid-1;
            }
            else if(nums[left]<=nums[mid]) {
               left=mid+1;
            }
            else if((nums[mid]<=nums[right]) && ((nums[mid]<=target) && (target <=nums[right]))) {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        }
        return false;
    }
}
