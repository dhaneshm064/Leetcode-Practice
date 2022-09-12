class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        calculateSum(candidates, target, 0, output, row);
        return output;
    }
    
    private void calculateSum(int[] nums, int target, int index, List<List<Integer>> output, List<Integer> row){
   //     System.out.println("target " + target + " index "+index+ " row "+row);
        if(target < 0 || index >= nums.length)
            return;
        if(target == 0)
        {
            List<Integer> copy = new ArrayList<>(row);
        //        System.out.println("copy "+copy);
            output.add(copy);
            return;
        }
        row.add(nums[index]);
        calculateSum(nums, target - nums[index] , index, output, row);
        row.remove(row.size() - 1);
        calculateSum(nums, target, index + 1, output, row);
        return;
    }
}