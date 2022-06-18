/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        if(isBadVersion(1))
            return 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isBadVersion(mid))
                if(isBadVersion(mid - 1))
                    high = mid - 1;
                else
                    return mid;
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}