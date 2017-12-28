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
     
     int[][] result= new int[row_length][column_length];
     int j = 0;//increment row 
     int k =0;//increment column 
     
     while(right_column>=left_column){
    	 
       System.out.println(j+","+k); 
     
       for(int i=top_row;i<=buttom_row;i++){
          
          result[j][k] = matrix_rotation[i][right_column];
          System.out.println(result[j][k]);
          j++;    
       }
          System.out.println("---------");
          right_column--;
          j=0;
          k++;
     }
     
     return result;
  }
  
  public static void main(String[] args){
     int[][] test={{1,2,3},{4,5,6},{7,8,9}};
     Matrix90dRotation.rotation(test);
  }
}