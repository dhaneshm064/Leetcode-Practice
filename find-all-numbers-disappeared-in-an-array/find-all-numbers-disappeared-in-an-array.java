class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length)
        {
            int correctIndex = nums[i] - 1;
            
            if((correctIndex) != i && nums[correctIndex] != nums[i]){
                swap(correctIndex, i, nums);
                i--;
            }
            i++;
        }
        List<Integer> output = new ArrayList<Integer>();
        for(int j = 0 ; j < nums.length; j++)
            if(nums[j] != j+1)
                output.add(j+1);
        return output;
        
    }
    
    public void swap(int index1, int index2, int[] nums){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}