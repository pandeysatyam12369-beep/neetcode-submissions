class Solution {
    
    public int trap(int[] height) {
        int n=height.length;
        int[] nge=new int[n];
        int[] pge=new int[n];
        pge[0]=0;
        nge[n-1]=0;
        for(int i=1;i<n;i++){
            pge[i]=Math.max(pge[i-1],height[i-1]);
        }
        for(int j=n-2;j>=0;j--){
            nge[j]=Math.max(nge[j+1],height[j+1]);
        }
        int volumn=0;
        for(int k=0;k<n;k++){
            int level=Math.min(pge[k],nge[k]);
           if(level>height[k]) volumn+=level-height[k];  //chath per ka volumn
        }
        return volumn;
    }
}
