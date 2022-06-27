class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> output = new ArrayList();
        if(x <= arr[0] || arr.length == 1)
            for(int i = 0 ; i < k; i++)
                output.add(arr[i]);
        if(output.size() > 0)
            return output;
        if(x >= arr[arr.length - 1])
            for(int i = arr.length - 1 ; i >= arr.length - k; i--)
                output.add(arr[i]);
        Collections.sort(output);
        if(output.size()>0)
            return output;
        
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high - low )/2;
           // System.out.println(" "+low+" "+mid+" "+high);
            if(mid - 1 < 0)
                mid ++;
            if(arr[mid - 1] < x && arr[mid] >= x ){
                int lowPtr = mid - 1;
                int highPtr = mid;
                int count = 0;
                
                while(lowPtr >= 0 && highPtr < arr.length && count < k){
                    int minLow = Math.abs(arr[lowPtr] - x);
                    int minHigh = Math.abs(arr[highPtr] - x);
                    if(minHigh < minLow){
                        output.add(arr[highPtr]);
                        highPtr++;
                    }else{
                        output.add(arr[lowPtr]);
                        lowPtr--;
                    }
                    count++;
                }
                if(count != k)
                    while(lowPtr >= 0 && count != k)
                    {    output.add(arr[lowPtr--]);
                        count++;
                    }
                    while(highPtr<= arr.length - 1 && count != k){
                        output.add(arr[highPtr++]);
                        count++;
                    }
                Collections.sort(output);
                return output;
            }else if(x > arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
                
        }
        return output;
    }
}