// This will be the optimal approach where we transpose array means row==.col col==>row then reverse individual row.
//No extra space complexity
// https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        int length=matrix.length; 
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
            
            }
            System.out.println(matrix[0][0]);

            
                for(int j=0;j<matrix.length;j++){
                    int start=0;
                    int end=(matrix[j].length)-1;
                    while(start<=end){
                        int temp=matrix[j][start];
                        matrix[j][start]=matrix[j][end];
                        matrix[j][end]=temp;
                        start=start+1;
                        end=end-1;
                    }
                }
            
            
        
        System.out.println(matrix);
    }
    }
