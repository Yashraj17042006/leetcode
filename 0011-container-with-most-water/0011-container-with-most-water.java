class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int currH=Math.min(height[left],height[right]);
            int width=right-left;
            int currA=currH*width;
            area=Math.max(area,currA);
            if(height[left]<height[right]){
                left++;
            } else{
                right--;
            }

        }
        return area;

  }
}
