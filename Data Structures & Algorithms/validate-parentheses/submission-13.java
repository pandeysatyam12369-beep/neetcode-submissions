class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        int n=s.length();
        if(s.length()==1) return false;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                if(Valid(st.peek(),ch)){
                    if(st.size()!=0) st.pop();
                }
                else{
                    return false;
                }
            }
            i++;
        }
        if(st.size()==0) return true;
        return false;
    }
    public boolean Valid(char ch1,char ch2) {
        if(ch1=='(' && ch2==')') return true;
        if(ch1=='{' && ch2=='}') return true;
        if(ch1=='[' && ch2==']') return true;
        return false;
    }
}
