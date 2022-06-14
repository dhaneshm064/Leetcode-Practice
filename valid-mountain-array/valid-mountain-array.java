class Solution {
    public boolean validMountainArray(int[] arr) {
        
            int i = 0;
            while(i < arr.length - 1 && arr[i+1] > arr[i])
                i++;
            
            //Only ascending or descending case
            if(i == arr.length - 1 || i == 0)
                return false;
            
            while( i < arr.length - 1 && arr[i+1] < arr[i] )
                i++;
            
            if(i == arr.length - 1)
                return true;
            return false;
        }
}