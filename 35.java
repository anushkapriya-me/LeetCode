//Q35. Search Insert Position

class Solution(object):
    def searchInsert(self, nums, target):
        if len(nums) == 1:
            if (nums[0]>target):
                return 0
            if(nums[0]<target):
                return 1
            if(nums[0]==target):
                return 0
        for i in range(0,len(nums)):
            if ( nums[i] ==target):
                return i
            elif(nums[i]>target):
                return i
            
        return len(nums)