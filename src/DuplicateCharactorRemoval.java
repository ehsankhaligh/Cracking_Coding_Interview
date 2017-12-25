import java.util.Arrays;

/*
Design an algorithm and write code to remove the duplicate characters in a string
without using any additional buffer. NOTE: One or two additional variables are fine.
An extra copy of the array is not.
FOLLOW UP
Write the test cases for this method.
*/
public class DuplicateCharactorRemoval {
	
	
         //Assume we have ASCII 	
         public void duplicateCharactorRemoval(String str){
        	 boolean[] duplicateChar = new boolean[256];
        	 for(int i=0; i<str.length();i++){
        		 char value = str.charAt(i);
        		 if(!duplicateChar[value]){
        			 System.out.println(value);
        		 }
        		 duplicateChar[value]= true; 
        		 
        	 }
         }
         //another solution 
         
         public void removeDuplicateChar(char[] str){

        	 
        	 if (str == null) return;
        	 int len = str.length;
        	 if (len < 2) return;
        	 
        	 int tail = 1,j;
      
        	  for (int i = 1; i < len; ++i) {
        	  	for (j = 0; j < tail; ++j) {

        	  		if (str[i] == str[j]) break;
        	  	}
        	  	if (j == tail) {

        	  		str[tail] = str[i];
        	  		++tail;
        	  	}
        	  }	
        	  
        	  str[tail] = 0;
         }
         
         
     public static void main(String[] args){
        	 DuplicateCharactorRemoval ch = new DuplicateCharactorRemoval();
        	 ch.duplicateCharactorRemoval("abaaccd");
        	 //char[] str = {'b','a','a','d'};
        	 //ch.removeDuplicateChar(str);
        	 
         }
	}
	

