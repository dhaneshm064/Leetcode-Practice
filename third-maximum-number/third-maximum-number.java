class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] < first && nums[i] > second){
                third = second;
                second = nums[i];
            }
            else if(nums[i] < second && nums[i] > third){
                third = nums[i];
            }
        }
        
        return (third == Long.MIN_VALUE) ? (int)first : (int)third;
    }
}