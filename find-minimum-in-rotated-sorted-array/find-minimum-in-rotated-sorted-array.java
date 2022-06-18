class Solution {
    public int findMin(int[] arr) {
        int low = 0; 
        int high = arr.length  - 1;
        if(arr[low] < arr[high])
            return arr[low];
        if(arr.length == 1)
            return arr[0];
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid >= 1)
            {   
                if(arr[mid] < arr[mid - 1]){
                    return arr[mid];
                }
            }
            if(arr[mid] < arr[high]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            
        }
        return -1;
    }
}