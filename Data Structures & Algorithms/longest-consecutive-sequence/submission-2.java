class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int count=0;
        int maxcount=0;
        int longest=0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curr=num;
                int length=1;
                while(set.contains(curr+1)){
                    length++;
                    curr++;
                }
                longest=Math.max(longest,length);
            }
        
        }
        
        return longest;
    }
}
