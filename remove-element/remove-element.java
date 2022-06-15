class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr1 = 0;
        int i = 0;
        if(nums.length == 0 )
            return 0;
        
        for(; i < nums.length - 1; i++)
        {
            if(nums[i] != val)
            {
                nums[ptr1] = nums[i];
                ptr1++;
            }
           for(int j = 0; j < nums.length; j++)
               System.out.print(nums[j]+" ");
           System.out.println();
        }
        nums[ptr1] = nums[i];
        if(nums[ptr1] != val)
            ptr1++;
    
        return ptr1;
    }
}