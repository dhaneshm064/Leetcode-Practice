class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = 0;
       while(i <= nums.length - 1){
            int zeroCount = 0;
           int zeroIndex = nums.length;
            int count = 0;
           while(zeroCount < 2 && i <= nums.length - 1){ 
            if(nums[i] == 0)
            {
                zeroCount++;
                if(zeroCount == 2)
                    break;
                zeroIndex = i;
                    
            } 
              count++;
              i++;
           }

           max = Math.max(max, count);
            i = zeroIndex + 1;
        }
        return max;
    }
}