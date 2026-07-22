class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int n=heights.length;
        int j=n-1;
        int maxarea=0;
        while(i<j){
            int length=Math.min(heights[i],heights[j]);
            int width=j-i;
            int area=length*width;
            maxarea=Math.max(maxarea,area);
            if(heights[i]>=heights[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxarea;
    }
}
