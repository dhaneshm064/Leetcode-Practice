class Solution {
    public int findPeakElement(int[] arr) {
        
        if(arr.length < 2)
            return 0;
        int n = arr.length;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
        if(mid == 0)
        {   low = mid + 1;
            continue;
        }
        if(mid == arr.length){
            high = mid - 1;
            continue;
        }
            
            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                return mid;
            else if(arr[mid] > arr[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}