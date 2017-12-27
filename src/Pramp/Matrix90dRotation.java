package Pramp;

public class Matrix90dRotation{
  
  //assume we have numbers 
  public static int[][] rotation(int[][] matrix_rotation){
     
     int row_length = matrix_rotation.length;
     int column_length = matrix_rotation[0].length;
     
     int right_column = column_length - 1;
     int left_column = 0;
     int top_row = 0;
     int buttom_row = row_length - 1;
     
     int[][] result={{}};
     int j = 0;//increment row 
     int k =0;//increment culumn 
     
     while(right_column>=left_column){
     
       for(int i=top_row;i<=buttom_row;i++){
          result = new int[j+1][k+1];
          result[j][k] = matrix_rotation[i][right_column];
          System.out.println(result[j][k]);
          j++;    
       }
          System.out.println("---------");
          right_column--;
          k++;
     }
     
     return result;
  }
  
  public static void main(String[] args){
     int[][] test={{1,2,3},{4,5,6},{7,8,9}};
     Matrix90dRotation.rotation(test);
  }
}