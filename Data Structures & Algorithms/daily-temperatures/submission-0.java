class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int n=temp.length;
        int[] arr=new int[temp.length];
        st.push(n-1);
        arr[n-1]=0;
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            if(st.size()==0){
                arr[i]=0;
            }
            else{
                arr[i]=st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}