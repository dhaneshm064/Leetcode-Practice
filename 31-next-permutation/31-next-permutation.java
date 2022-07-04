class Solution {
    public void nextPermutation(int[] nums) {
        /*
        1 2 3 4 5
        1 2 3 5 4
        1 2 4 3 5
        1 2 4 5 3
        1 2 5 3 4
        1 2 5 4 3
        
        1 3 5 4 2
        
        1) Iterate till increasing sequence from back.
        By this we will know by changing which element to its NGE we will get the next permutuation
        
                5
                    4
            3       
                        2
        1
        
        change the prefix from 3 from where it is non increasing to find the next permutuation
        
        
        2) Find NGE of 3 on the RHS i.e iterate from last (since it is in increasing order)
        
        i.e 4 
        3) swap 3 & 4
        
        1 4 5 3 2

        4) now we need least ordering for very next permutuation, so sort elements after 4
        i.e nothing but reverse the arr since we have swapped element with nge
        
        1 4 2 3 5
        
        */
    
        int n = nums.length - 1;
        if(n == 0)
            return;
        int index  = nums.length - 1;
        int elem = nums[n - 1];
        
        while(n > 0 && nums[n - 1] >= nums[n])
            n --;    
        
        index = n - 1;
        
        if(index < 0)
           reverse(nums, 0, nums.length - 1);
        else
        {   
            int nge = index;
            for(int i = nums.length - 1; i > index; i--)
                if(nums[i] > nums[index])
                { 
                    nge = i;
                    break;
                }
            System.out.println(index+" "+nge);
            swap(nge, index, nums);
            reverse(nums, index + 1, nums.length - 1);
         }
    }
    
    public void swap(int index1, int index2, int nums[]){
        
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    
    public void reverse(int nums[], int low, int high){
        while(low<=high){
            swap(low, high, nums);
            low++;
            high--;
        }
    }
    
}