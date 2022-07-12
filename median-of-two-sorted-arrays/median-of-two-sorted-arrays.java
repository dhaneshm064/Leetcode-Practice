class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        
        int ptr1 = 0;
        int ptr2 = 0;
        int tot = l1 + l2;
        
        if((l1 + l2) % 2 == 0)
        {
            
            int elem1 = tot/2 - 1;
            int elem2 = elem1 + 1;
            int ptr = 0;
            int output = 0;
             while(ptr1 < l1 && ptr2 < l2)
            {
                if(nums1[ptr1] < nums2[ptr2])
                {
                    if(ptr == elem1 || ptr == elem2)
                        output+= nums1[ptr1];
                    ptr1++;
                    ptr++;
                }else{
                    if(ptr == elem1 ||ptr == elem2)
                        output+= nums2[ptr2];
                    ptr2++;
                    ptr++;
                }
                
            }
            while(ptr1 < l1)
            {    if(ptr == elem1 || ptr == elem2)
                        output+= nums1[ptr1];
                ptr1++;
                ptr++;
            }
            while(ptr2 < l2)
            {
                if(ptr == elem1 || ptr == elem2)
                      output+= nums2[ptr2];
                ptr2++;
                ptr++;
            }
            return (double)output/2;
            
            
        }else{
            int opPtr = (l1 + l2)/2;
            int ptr = 0;
            while(ptr1 < l1 && ptr2 < l2)
            {
                if(nums1[ptr1] < nums2[ptr2])
                {
                    if(ptr == opPtr)
                        return nums1[ptr1];
                    ptr1++;
                    ptr++;
                }else{
                    if(ptr == opPtr)
                        return nums2[ptr2];
                    ptr2++;
                    ptr++;
                }
                
            }
            while(ptr1 < l1)
            {    if(ptr == opPtr)
                    return nums1[ptr1];
                ptr1++;
                ptr++;
            }
            while(ptr2 < l2)
            {
                if(ptr == opPtr)
                    return nums2[ptr2];
                ptr2++;
                ptr++;
            }
            
        }
        return -1;
    }
}