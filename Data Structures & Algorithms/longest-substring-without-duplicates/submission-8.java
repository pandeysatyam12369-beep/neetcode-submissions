class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int n=s.length();
       
        int maxcount=0;
        HashSet<Character> set=new HashSet<>();
        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxcount=Math.max(maxcount,j-i+1);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
                
            }
           
           
        }
        return maxcount;
    }
}
