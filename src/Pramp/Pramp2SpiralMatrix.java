 package Pramp;

public class Pramp2SpiralMatrix{
  public static int[] spiralCopy(int[][] inputMatrix){
       
       int row_length = inputMatrix.length;
       int column_length = inputMatrix[0].length;
       
       int  top_row = 0;
       int  buttom_row = row_length-1;
       int  left_column = 0; 
       int  right_culomn = column_length -1;
       int[] result ={};
       int l=0;//index result  array count
 
       
       while(right_culomn>=left_column && top_row<=buttom_row){
          
          result = new int[l+1];
          //left culomn to righ culomn      
          for(int i=left_column; i<=right_culomn;i++){

              result[l] = inputMatrix[top_row][i];
              System.out.println(l+","+result[l]); 
              l++; 
              result = new int[l+1];
              
          }
          top_row++;   
          
       
         //top row to buttom row
          for(int j=top_row;j<=buttom_row;j++){
             result[l]=inputMatrix[j][right_culomn];
             System.out.println(l+","+result[l]);
             l++;
             result = new int[l+1];
          }
          right_culomn--;
       
         //right culomn to left culomn         
          for(int k=right_culomn;k>=left_column; k--){
             result[l]=inputMatrix[buttom_row][k]; 
             System.out.println(l+","+result[l]);
             l++;
             result = new int[l+1];
          }
          buttom_row--;
      
          
          //buttom row to top row
          for(int w=buttom_row;w>=top_row;w--){
            result[l]=inputMatrix[w][left_column];
            System.out.println(l+","+result[l]);
            l++;
            result = new int[l+1];
          }
          left_column++;
                   
         /*
         System.out.println("---");
         System.out.println("top_row "+top_row);
         System.out.println("right_culomn "+right_culomn);
         System.out.println("buttom_row "+buttom_row);
         System.out.println("left_column "+left_column);
         System.out.println("---");
         */
       }
         
         
        return result;
  }
  
  public static void main(String[] args){
   
/*
Test Case #1
Input: [[1]],Expected: [1]
Test Case #2
Input: [[1],[2]],Expected: [1,2]
Test Case #3
Input: [[1,2]],Expected: [1,2]
Test Case #4
Input: [[1,2],[3,4]],Expected: [1,2,4,3]
Test Case #5
Input: [[1,2,3,4,5],[6,7,8,9,10]],Expected: [1,2,3,4,5,10,9,8,7,6]
Test Case #6
Input: [[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20]],Expected: [1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12]
*/
	  
	  int[][] test1 = {{1,2,3,4,5},
                      {6,7,8,9,10},
                      {11,12,13,14,15},
                      {16,17,18,19,20}
                      };
	  
	  int[][] test2 ={{1}};
	  int[][] test ={{1,2,3,4,5},{6,7,8,9,10}};
     
     Pramp2SpiralMatrix.spiralCopy(test);
     
     //int[][] test = new int[33][4];
     //int row_length = test.length;
     //int column_length = test[0].length;                     
     //System.out.println(test[0][4]);
     //System.out.println(row_length);
     //System.out.println(column_length);
  }
}