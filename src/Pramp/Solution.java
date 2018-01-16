import java.io.*;
import java.util.*;

class Solution {

  static void mirrorReverse(char arr[], int start, int end){
   
    char temp; 
    
    /*for(int i=0; i<arr.length; i++){
       System.out.println(arr[i]);   
    }
 
    System.out.println("-----------");*/
    
    while(start < end){
       temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;
       start++;
       end--;
       
    }
    
    /*for(int i=0; i<arr.length; i++){
       System.out.println(arr[i]);   
    }*/
 
  }
  static char[] reverseWords(char[] arr) {
    
    int length = arr.length; 
    mirrorReverse(arr,0,length-1);
    int[] space_index;
     
    //reverse each word:
    int wordStart = -1;
    for(int i=0; i<length;i++){
        if (arr[i] == ' '){
            if (wordStart != -1){
                mirrorReverse(arr, wordStart, i-1);
                wordStart = -1;
                System.out.println("A");
            }    
               
        }else if (i == length-1){
            if (wordStart != -1)
                mirrorReverse(arr, wordStart, i);
                System.out.println("B");
        }else{
            if (wordStart == -1)
                wordStart = i;
                
        }        
    }
    
    for(int i=0; i<arr.length-1;i++){
       System.out.println(arr[i]);
    }
        
    return arr;
    
  }

  public static void main(String[] args) {
     char[] reverse = { 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                        'm', 'a', 'k', 'e', 's', ' ',
                        'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};
                        
     //int length = reverse.length;
     //mirrorReverse(reverse, 0, length-1);
     reverseWords(reverse);
  }
  
}
