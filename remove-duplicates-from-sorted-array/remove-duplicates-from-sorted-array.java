class Solution {
    public int removeDuplicates(int[] nums) {
        
        int ptr = 0;
        int count = 0;
        if(nums.length == 0)
            return 0;
        for(int i = 0 ; i < nums.length - 1; i ++){
            
            if(nums[i] == nums[i + 1]){
                count++;
            }else{
                nums[ptr] = nums[ptr + count];
                ptr++;
            }
        }
        nums[ptr] = nums[ptr + count];
        return nums.length - count;
    }
}