class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!map.containsKey(c)) return false;
            int freq=map.get(c);
            if(freq==0) return false;
            map.put(c,freq-1); //used to decreasethe frequency
        }
        return true;
    }
}
