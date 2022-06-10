class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0 ; 
        int right = nums.length - 1;
        
        int output[] = new int[nums.length];
        int count = nums.length - 1;
        while(left <= right){
            int leftElement = nums[left];
            int rightElement = nums[right];
            
            if(leftElement < 0)
                leftElement *= -1;
            if(rightElement < 0)
                rightElement *= -1;
            
            if(leftElement > rightElement){
                output[count--] = leftElement * leftElement;
                left ++;
            }else{
                output[count--] = rightElement * rightElement;
                right --;
            }
            
        }
        return output;
    }
}