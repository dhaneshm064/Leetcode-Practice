class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(mid <= high)
        {
       
            if(nums[mid] == 0)
            {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums, mid, high);
                high--;
            }
            else
                mid++;
        }
    }
    public void swap(int[] nums, int index1, int index2)
    {
        
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    }