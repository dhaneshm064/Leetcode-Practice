class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int val = arr[i] * 2;
            int low = 0;
            int high = arr.length - 1;
            if(val < 0){
                low = 0;
                high = i - 1;
            }
            else{
                low = i + 1;
                high = arr.length - 1;
            }
            if(binarySearch(val, arr, low, high))
                return true;
        }
        return false;
    }
    
    public boolean binarySearch(int value, int[] arr, int low, int high) {
        while(low <= high){
            
            int mid = low + (high - low)/2;
            if(value > arr[mid])
                low = mid + 1;
            else if( value < arr[mid])
                high = mid - 1;
            else if(value == arr[mid])
                return true;
        }
        return false;
    }
}