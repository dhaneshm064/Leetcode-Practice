class Solution {
    public void reverseString(char[] s) {
        reverse(0, s.length - 1 ,s);
    }
    public void reverse(int low, int high, char[] s){
        if(low >= high)
            return;
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        reverse(low + 1, high - 1, s);
    }
}