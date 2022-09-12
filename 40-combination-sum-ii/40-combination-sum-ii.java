class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        Arrays.sort(candidates);
        for(int i = 0; i < candidates.length; i++)
            System.out.print(candidates[i] +"  ");
        calculateSum(candidates, target, 0, output, row);
        return output;
    }
     
    private void calculateSum(int[] nums, int target, int index, List<List<Integer>> output, List<Integer> row){
       // System.out.println("row "+row+" index "+index+" target "+target);
        if(target == 0)
        {
            List<Integer> copy = new ArrayList<>(row);
            output.add(copy);
            return;
        }
        if(target < 0 || index >= nums.length)
            return;
        
        row.add(nums[index]);
        calculateSum(nums, target - nums[index] , index + 1, output, row);
        row.remove(row.size() - 1);
        while(index < nums.length - 1 && nums[index] == nums[index + 1])
        {
            index++;
        }
        calculateSum(nums, target, index + 1, output, row);
        return;
    }
}