class Solution {
    public int trap(int[] height) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        
        int leftVal = 0;
        int rightVal = 0;
        for(int i = 0; i < height.length; i++){
            int rightInd = height.length - i - 1;
            if(i == 0)
            {
                leftMax[i] = 0;
                rightMax[rightInd] = 0;
                leftVal = height[i];
                rightVal = height[rightInd];
            }else{
                leftVal = Math.max(leftVal, height[i]);
                rightVal = Math.max(rightVal, height[rightInd]);
                leftMax[i] = leftVal;
                rightMax[rightInd] = rightVal;
            }
            
        }
        
        int sum = 0;
        for(int i = 0; i < height.length; i++){
            int min = Math.min(leftMax[i], rightMax[i]);
                if(min != 0)
                    sum += min - height[i];
                
        }
        return sum;
    }
}