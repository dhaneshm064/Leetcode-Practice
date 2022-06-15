class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenPtr = 0;
        int oddPtr = nums.length - 1;
        
        while(evenPtr < oddPtr){
            if(nums[evenPtr] % 2 == 0)
                evenPtr++;
            else
                swap(evenPtr, oddPtr, nums);
            if(nums[oddPtr] %2 != 0)
                oddPtr--;
            else
                swap(evenPtr, oddPtr, nums);
        }
        return nums;
    }
    
    public void swap(int ptr1, int ptr2, int[] nums){
        int temp = nums[ptr1];
        nums[ptr1] = nums[ptr2];
        nums[ptr2] = temp;
    }
}