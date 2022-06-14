class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr2 = 0;
        int ptr1 = 0;
        while(ptr1 < m && ptr2 < n){
            if(nums1[ptr1] > nums2[ptr2]){
                for( int i = m ; i > ptr1; i--){
                    nums1[i] = nums1[i - 1];
                }
                nums1[ptr1] = nums2[ptr2];
                m++; 
                ptr1++;
                ptr2++;
            }else{
                ptr1++;
            }
        }
            while(ptr2 < n){
                nums1[ptr1++] = nums2[ptr2++];
            }   
        
    }
}