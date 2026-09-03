class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int  len=nums1.length+nums2.length;
        int  A[]=new int  [len];
        for(int i=0;i<len;i++){
             if(i<nums1.length)
             A[i]=nums1[i];
             if(i<nums2.length)
             A[i+nums1.length]=nums2[i];
        }
    Arrays.sort(A);
    return (len%2==0)?(A[len/2-1]+A[len/2])/2.0:A[(len)/2];
    }
}