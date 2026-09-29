class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
            int j=0;
            int distance=0;
        for(int i=0;i<nums1.length;i++){
            int value=nums1[i];
            if(j<i)
            j=i+1;
            while(j<nums2.length && nums2[j]>=nums1[i]){
                j++;
            }
            distance=Math.max(distance,j-i-1);
        }
        return distance;
    }
}