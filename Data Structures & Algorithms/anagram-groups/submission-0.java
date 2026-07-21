class Solution {
    public String sort(String strs) {
       char[] ch=strs.toCharArray();
       Arrays.sort(ch);
       String key=new String(ch);
       return key;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>  map=new HashMap<>();
        for(String ele : strs){
            String key=sort(ele);
            if(!map.containsKey(key)){
                List<String> list=new ArrayList<>();
                list.add(ele);
                map.put(key,list);
            }
            else{
                map.get(key).add(ele);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> ele: map.values()){
            ans.add(ele);
        }
        return ans;
    }
}
