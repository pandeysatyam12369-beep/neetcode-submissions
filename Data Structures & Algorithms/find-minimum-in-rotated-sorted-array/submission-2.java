class Solution {
    public int findMin(int[] nums) {
        int a=Integer.MAX_VALUE;
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<a){
                a=nums[i];
            }
        }
        return a;
    }
}
