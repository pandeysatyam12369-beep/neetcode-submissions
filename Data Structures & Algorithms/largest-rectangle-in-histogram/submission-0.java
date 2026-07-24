class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] pge=new int[n];
        int[] nge=new int[n];
        nge[n-1]=n;
        pge[0]=-1;
        if(heights.length==1) return heights[0];
        for(int i=n-1;i>=0;i--){
            while(st.size()!=0 && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.size()==0) nge[i]=n;
            else nge[i]=st.peek();
            st.push(i);
        }
        st.clear();
       
        for(int i=0;i<n;i++){
            while(st.size()!=0 && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.size()==0) pge[i]=-1;
            else pge[i]=st.peek();
            st.push(i);
        }
        int area=0;
        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            area=(nge[i]-pge[i]-1)*heights[i];
            maxarea=Math.max(maxarea,area);
            
        }
        return maxarea;
    }
}