
public class InsertionSort {

	public static int[] insetionSort(int[] arr){
		int arrLength = arr.length;
		
		for(int i=0; i<arrLength;i++){
		   
           int key = arr[i];
           int j = i-1;
           
           while(j>=0 && arr[j]>key){
        	   arr[j+1] = arr[j];
        	   j = j-1;
           }
           
           arr[j+1] = key;
			
		}
		return arr;
	}
	
	public static void main(String[] args){
		
		int arr[] = {12, 11, 13, 5, 6};
		insetionSort(arr);
		
		for(int k=0; k<arr.length; k++){
			System.out.println(arr[k]);
		}
	}
}
