class Solution {
    public int[] searchRange(int[] arr, int target) {
        int output[] = {-1,-1};
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                int lowPtr = mid;
                while(lowPtr >= 0 && arr[lowPtr] == target)
                    lowPtr --;
                int highPtr = mid;
                while(highPtr < arr.length && arr[highPtr] == target)
                    highPtr ++;
                output[0] = lowPtr + 1;
                output[1] = highPtr - 1;
            }
            
            if(target < arr[mid]){
                high = mid - 1;
            }else{
                low = mid  + 1;
            }
        }
        
        return output;
    }
}