class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            String ch=tokens[i];
            if(ch.equals("+")){
                int a=st.pop();
                int b=st.pop();
                int sum=a+b;
                st.push(sum);
            }
            else if(ch.equals("-")){
                int a=st.pop();
                int b=st.pop();
                int min=b-a;
                st.push(min);
            }
            else if(ch.equals("*")){
                int a=st.pop();
                int b=st.pop();
                int mull=a*b;
                st.push(mull);
            }
            else if(ch.equals("/")){
                int a=st.pop();
                int b=st.pop();
                int div=b/a;
                st.push(div);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}