package leetcode;

/**
 * @Author: zhen
 * @DateTime: 2021/3/31 21:25
 * @Description: TODO
 */
public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ret=false;
        for(int i=0 ;i<matrix.length;i++){
            if(target<=matrix[i][matrix[i].length-1]){
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j]<target){
                        continue;
                    }else if(matrix[i][j]==target)  {
                        ret=true;
                        break;
                    } else{
                        break;
                    }
                }
                break;
            }
        }
        return ret;
    }
}
