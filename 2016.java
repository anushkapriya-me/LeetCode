//Q2016. Maximum Difference Between Increasing Elements
class Solution {
    public int maximumDifference(int[] nums) {
        int min= nums[0];
        int max=-1;
        for(int i=1;i<nums.length;i++){
            if (nums[i]<min){
                min=nums[i];
            }
            else if(nums[i]>min){
                int maxDiff=nums[i]-min;
                max=Math.max(maxDiff,max);
            }
        }
        return max;
    }
}