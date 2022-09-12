class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        calcSubsets(output, nums, 0, new ArrayList<Integer>());
        return output;
    }
    public void calcSubsets(List<List<Integer>> output, int[] nums, int index, List<Integer> row){
        if(index == nums.length)
        {  
            List<Integer> dummyRow = new ArrayList<>(row);
            output.add(dummyRow);
            return;
        }
        row.add(nums[index]);
        calcSubsets(output, nums, index + 1, row);
        row.remove(row.size() - 1);
        while(index < nums.length - 1 && nums[index] == nums[index + 1])
            index++;
        calcSubsets(output, nums, index + 1, row);

        return;
    }
}