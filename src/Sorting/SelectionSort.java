public class SelectionSort{

    public static int[] selectionSort(int[] arr){

       int arrLen = arr.length;
       int temp;
       
       for(int i=0; i<arrLen-1; i++){
         for(int j=i+1; j<arrLen; j++){
         
           
            if(arr[j]<arr[i]){
               
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               
            }
          }  
       }
       
       for(int k=0; k<arrLen; k++){
       
          System.out.println(arr[k]);
       }
       
       return arr;   
    }
       
     
    public static void main(String[] args){
    
       int[] arr = {9,8,7,6,5,4,0,1};
       selectionSort(arr);
    }    
}
       
