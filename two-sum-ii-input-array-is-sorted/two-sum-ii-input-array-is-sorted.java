class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int output[] = new int[2];
        while(low < high){
            if(numbers[low] + numbers[high] < target)
                low++;
            else if(numbers[low] + numbers[high] > target)
                high--;
            else{
                output[0] = low + 1;
                output[1] = high + 1;
                return output;
            }
        }
        return output;
    }
}