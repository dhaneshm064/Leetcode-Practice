class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 0)
            return false;
        if(num == 1)
            return true;
        long low = 0;
        long high = num/2;
        while(low <= high){
            long mid = low + (high - low)/2;
                        System.out.println(low + " "+ mid + " "+high+ " ");
            if(num == mid * mid)
                return true;
            if(num > mid * mid ){
                low = mid + 1;
            }else{
                 high = mid - 1;
            }
        }
        return false;
    }
}