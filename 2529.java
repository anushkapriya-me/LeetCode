//Q.2529. Maximum Count of Positive Integer and Negative Integer

class Solution {
    public int maximumCount(int[] nums) {
        int neg=0,pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg+=1;
            }
            if(nums[i]==0){
                continue;
            }
            if(nums[i]>0){
                pos+=1;
            }
        }
        int maxi=Math.max(neg,pos);
        return maxi;
    }
    
}