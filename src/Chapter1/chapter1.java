package Chapter1;

import java.util.ArrayList;
import java.util.HashMap;

public class chapter1 {
    
	//HashMap Example
	/*  	
	public HashMap<Integer, Student> buildMap(Student[] students) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for (Student s : students) map.put(s.getId(), s);
		return map;
		}
	*/
	
	public ArrayList<String> merge(String[] words, String[] more){
		
		ArrayList<String> sentense = new ArrayList<String>();
		
		for(String w: words) sentense.add(w);
		for(String m: more)  sentense.add(m);
		
		//Test the output 
		System.out.println(sentense);
		
		return sentense;		
	}
	
	public String bufferString(String[] words){
		StringBuffer sentense = new StringBuffer();
		
		for(String w: words) sentense.append(w);
 
		//Test The output 
		System.out.println(sentense.toString());
		return sentense.toString();
	}
}
