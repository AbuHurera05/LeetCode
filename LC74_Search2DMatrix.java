// import java.util.Arrays;

// public class LC74_Search2DMatrix {
//    public static void main(String[] args) {
//       int[][] matrix = {
//          {1, 3, 5, 7},
//          {10, 11, 16, 20},
//          {23, 30, 34, 50},
//          {60, 61, 62, 63}
//       };
//       int target = 3;
//       int []ans = searchMatrix(matrix, target);
//       System.out.println(Arrays.toString(ans));
//    }
//    private static int[] searchMatrix(int[][] matrix,int target){
//       int n=matrix.length;
//       int m=matrix[0].length;
      
//       int startRow=0;
//       int endRow = n-1; 
//       while (startRow<=endRow) {
//          int midRow=startRow+(endRow-startRow)/2;
//          if(target >= matrix[midRow][0]  && target <= matrix[midRow][m-1]){
//             return binarySearch(matrix,target,midRow);
//          }
//          else if(target<matrix[midRow][0])
//             endRow=midRow-1;
//          else
//             startRow=midRow+1;
//       }
//       return new int[] {-1,-1};
//    }
//    private static int[] binarySearch(int matrix[][],int target,int row){
//       int start=0;
//       int end=matrix[0].length-1;
//       while (start<=end) {
//          int mid=start+(end-start)/2;
//          if(target==matrix[row][mid])
//             return new int[]{row,mid};
//          else if(target>matrix[row][mid])
//             start=mid+1;
//          else
//             end=mid-1;  
//       }
//       return new int[]{-1,-1};
//    }

// }


import java.util.Arrays;

public class LC74_Search2DMatrix {
   public static void main(String[] args) {
      int[][] matrix = {
         {1, 3, 5, 7},
         {10, 11, 16, 20},
         {23, 30, 34, 50},
         {60, 61, 62, 63}
      };
      int target = 9;
      boolean b = searchMatrix(matrix, target);
      System.out.println(b);
   }
   private static boolean searchMatrix(int[][] matrix,int target){
      int n=matrix.length;
      int m=matrix[0].length;
      
      int startRow=0;
      int endRow = n-1; 
      while (startRow<=endRow) {
         int midRow=startRow+(endRow-startRow)/2;
         if(target >= matrix[midRow][0]  && target <= matrix[midRow][m-1]){
            return binarySearch(matrix,target,midRow);
         }
         else if(target<matrix[midRow][0])
            endRow=midRow-1;
         else
            startRow=midRow+1;
      }
      return false;
   }
   private static boolean binarySearch(int matrix[][],int target,int row){
      int start=0;
      int end=matrix[0].length-1;
      while (start<=end) {
         int mid=start+(end-start)/2;
         if(target==matrix[row][mid])
            return true;
         else if(target>matrix[row][mid])
            start=mid+1;
         else
            end=mid-1;  
      }
      return false;
   }

}

