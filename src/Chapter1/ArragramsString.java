package Chapter1;


/*Write a method to decide if two strings are anagrams or not.
   TestCase Listen->SILENT  
   Assumption: ASCII Char 
 
 */
public class ArragramsString {
  
	//not a good solution 
	public static boolean arragrams(String str, String str1){
		
		int firstString = str.length();
		int secondString = str1.length();
		
		
		if(firstString!=secondString) return false;
		
		for(int i=0; i<=firstString;i++){
			for(int j=0;j<=secondString;j++){
			  try{	
				  if(str.charAt(i)==str1.charAt(j)){
					  System.out.println("True!!");
					  return true;
				  }
			  }catch (StringIndexOutOfBoundsException e) {
		                System.out.println("StringIndexOutOfBoundsException is handled. ");
			  }  
			}
		}
		System.out.println("False!");
	    return false;
	}
	
	public static boolean abagram1(String s, String t){
		
		if(s.length()!=t.length())return false;
		
		int[] letters = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		
		char[] s_array = s.toCharArray();
		System.out.println("s.toCharArray(): "+s.toCharArray());
		
		for(char c : s_array){
			if (letters[c] == 0) ++num_unique_chars;
			System.out.println(num_unique_chars);
		    ++letters[c];
		}
		
		for(int i=0; i<t.length();i++){
			int c = (int) t.charAt(i);
			if(letters[c]==0){
				return false;
			}
			letters[c]--;
			
			if(letters[c]==0){
				num_completed_t++;
				if(num_completed_t==num_unique_chars){
					return i == t.length() - 1;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		//ArragramsString.arragrams("abc", "badd");
		//ArragramsString.abagram1("abccfff", "fafccbf");
	}
}