package Pramp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Pramp1 {
 
	  //First solution 
	  public static int[] getIndicesOfItemWeights(int[] arr, int limit) {
		  
		  int[] return_arr ={};
		  if(arr.length<=1) return return_arr;
		  //System.out.println(arr.length);
		  //System.out.println(arr[2]);
		  
		  Hashtable<Integer,Integer> limHash = new Hashtable<Integer,Integer>();
		  for(int i=0; i<arr.length;i++){
			  limHash.put(arr[i], limit-arr[i]);
		  }
		  System.out.println(limHash.toString());
		  
		  for(int j=0; j<arr.length;j++){
			for(int k=0; k<arr.length;k++){  
			 
					if(arr[j]==arr[k]){
						k++;
					}
			  
					if(limHash.get(arr[j])==arr[k]){
				  
						System.out.println("["+arr[j]+","+limHash.get(arr[j])+"]");
						System.out.println("K index number:"+k+"\nj index number:"+j);
						System.out.println("["+k+","+j+"]");
						System.out.println("true"+"\n------");
				 
						int[] return_arr1 = {k,j};
						return return_arr1;
			  }
			  
			}
			
		  }
		return return_arr;
	  }
	  
	  
	  //second solution 
	  /*There is no difference between the objects; you have a HashMap<String, Object> 
	  in both cases. There is a difference in the interface you have to the object. 
	  In the first case, the interface is HashMap<String, Object>, whereas in the second 
	  it's Map<String, Object>. But the underlying object is the same.The advantage to 
	  using Map<String, Object> is that you can change the underlying object to be a 
	  different kind of map without breaking your contract with any code that's using it. 
	  If you declare it as HashMap<String, Object>, you have to change your contract if you 
	  want to change the underlying implementation.
	  
	  Hashmap vs hashtable
	  Hashtable does not allow null keys or values.  HashMap allows one null key and any number of null values.
	  hashmap is faster.
	  Hashtable methods are synchronized, but that only provides method-level protection against race conditions.
	  */
	  
	  public static int[] getIndicesOfItemWeights1(int[] arr, int limit) {
		  int[] result_arr ={};
		  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		  for(int i=0; i<arr.length;i++){
			 
			 int key = arr[i];
			 int complemnt = limit - key;
			 
			 if(map.get(complemnt)!=null){
				 
				 int value_index = Arrays.binarySearch(arr, complemnt);
				 int[] result_arr1 = {i,value_index};
				 
				 //System.out.println("["+i+","+value_index+"]");
				 return  result_arr1;
			 }
			 else{
				 map.put(key, complemnt);
			 }
		  }
		  return result_arr;
	  }
	  
	  public static void main(String[] args) {
		 
		  /*Test Case #1
		  Input: [9], 9,Expected: [],Actual: []
		  Test Case #2
		  Input: [4,4], 8,Expected: [1,0],Actual: [1, 0]
		  Test Case #3
		  Input: [4,4,1], 5,Expected: [2,1],Actual: [2, 0]
		  Test Case #4
		  Input: [4,6,10,15,16], 21,Expected: [3,1],Actual: [3, 1]
		  Test Case #5
		  Input: [4,6,10,15,16], 20,Expected: [4,0],Actual: [4, 0]
		  Test Case #6
		  Input: [12,6,7,14,19,3,0,25,40], 7,Expected: [6,2],Actual: [6, 2]*/
		  int[] arr = {12,6,7,14,19,3,0,25,40};
		  int limit = 7;
		  Pramp1.getIndicesOfItemWeights1(arr,limit);
	  }
}
