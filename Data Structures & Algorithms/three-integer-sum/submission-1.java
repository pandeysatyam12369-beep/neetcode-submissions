class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    j++;
                    k--;
                }
            }
            
        }
        for(List<Integer> ele :set){
            ans.add(ele);
        }
        return ans;
    }
}
