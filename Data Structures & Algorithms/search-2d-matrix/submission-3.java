class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //hum pehle row nikalenge
        int st=0;
        int m=matrix.length;
        int n=matrix[0].length;  //total number of rows
        int row=0;
        int end=m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(matrix[mid][n-1]>=target && matrix[mid][0]<=target){
                row=mid;
                break;
            }
            else if(matrix[mid][n-1]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        int a=0;
        int b=n-1;
        while(a<=b){
            int mid=a+(b-a)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                b=mid-1;
            }
            else{
                a=mid+1;
            }
        }
        return false;
    }
}
