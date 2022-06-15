class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        while(low <= high){
            long mid = low +(high - low)/2;
            long square = mid*mid;
            System.out.println("low "+low+" mid "+mid+" high "+high+" square "+square);
            if(square > x){
                high = mid - 1;
            }else if(square < x){
                low = mid + 1;
            } else if(square == x){
                return (int)mid;
            }
            
        }
        return (int)high;
    }
}