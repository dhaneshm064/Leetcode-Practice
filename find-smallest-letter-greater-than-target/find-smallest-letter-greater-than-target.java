class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
            if(target >= letters[high])
                return letters[0];
        if(target< letters[low])
            return letters[low];
        while(low <= high){
            int mid = low + (high - low)/2;
            if(letters[mid] > target)
                high = mid - 1;
            else if(letters[mid] < target)
                low = mid + 1;
            else{
                mid++;
                while(mid < letters.length && letters[mid] == target )
                    mid++;
                return letters[mid];
                   
            } 
            
        }
        return letters[low];
    }
}