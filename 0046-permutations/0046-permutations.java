class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for(int num: nums)
        {
            numList.add(num);
        }
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        helperPermut(numList, output, row);
        return output;
    }
    
    private void helperPermut(List<Integer> numList, List<List<Integer>> output, List<Integer> row){
        if(numList.size() == 0)
        {   
            output.add(new ArrayList<Integer>(row));
            return;
        }
        for(int i = 0; i < numList.size(); i++){
            int elem  = numList.get(i);
            numList.remove(i);
            row.add(elem);
            helperPermut(numList, output, row);
            numList.add(i, elem);
            row.remove(row.size() - 1);
        }
    }
}