class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr1 = 0;
        int count = 0;
        int i = 0;
        if(nums.length == 0 )
            return 0;
        
        for(; i < nums.length - 1; i++)
        {
            if(nums[i] == val)
            {
                count++;
            }else{
                nums[ptr1] = nums[i];
                ptr1++;
            }
        }
        nums[ptr1] = nums[i];
        if(nums[i] == val)
            count++;
    
        return nums.length - count;
    }
}