class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : map.keySet()){
            int freq=map.get(ele);
           if( bucket[freq]==null){
            bucket[freq]=new ArrayList<>();
            bucket[freq].add(ele);
           }
           else{
           bucket[freq].add(ele);
           }
        }
        int[] ans=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0 && index<k;i--){
            if(bucket[i]!=null){
                for(int ele : bucket[i]){
                    ans[index++]=ele;
                    if(index==k){
                        break;
                    }
                }
            }
        }
        return ans;

    }
}
