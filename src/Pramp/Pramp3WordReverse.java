public class Pramp3WordReverse{

  static char[] reverseWords(char[] arr) {
    
    int length = arr.length; 
    char[] result = new char[length]; 
    
    if(length <=2) return result; 
      
      int i=0;
      int char_count = 0;
      for(int j=length-1; j>=0; j--){ 
       
       if(arr[j]!=' '){ 
         result[i] = arr[j];
         System.out.println(i+" "+result[i]+"  "+j+" "+arr[j]);
         char_count++;
         System.out.println("Char Count "+char_count);
         i++;
         
       }
       else{
         break;
       }
       
    }  
     return result; 
  }

  public static void main(String[] args) {
      
     char[] arr = { 'm','a','y',' ', 'h','i'};
                    
     reverseWords(arr);
     
  }

}

/*
Test Case #1
Input: [" "," "],Expected: [" "," "]
Test Case #2
Input: ["a"," "," ","b"],Expected: ["b"," "," ","a"]
Test Case #3
Input: ["h","e","l","l","o"],Expected: ["h","e","l","l","o"]
Test Case #4
Input: ["p","e","r","f","e","c","t"," ","m","a","k","e","s"," ","p","r","a","c","t","i","c","e"],Expected: ["p","r","a","c","t","i","c","e"," ","m","a","k","e","s"," ","p","e","r","f","e","c","t"]
Test Case #5
Input: ["y","o","u"," ","w","i","t","h"," ","b","e"," ","f","o","r","c","e"," ","t","h","e"," ","m","a","y"],Expected: ["m","a","y"," ","t","h","e"," ","f","o","r","c","e"," ","b","e"," ","w","i","t","h"," ","y","o","u"]
Test Case #6
Input: ["g","r","e","a","t","e","s","t"," ","n","a","m","e"," ","f","i","r","s","t"," ","e","v","e","r"," ","n","a","m","e"," ","l","a","s","t"],Expected: ["l","a","s","t"," ","n","a","m","e"," ","e","v","e","r"," ","f","i","r","s","t"," ","n","a","m","e"," ","g","r","e","a","t","e","s","t"]

*/