class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int max2 = 0;
        int index = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num > max)
            {
                index = i;
                max2 = max;
                max = num;
            }else if (num > max2){
                max2 = num;
            }
        }
        max2 *= 2;
        if(max >= max2)
            return index;
        return -1;
    }
}