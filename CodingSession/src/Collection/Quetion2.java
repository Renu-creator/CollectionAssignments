/*Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in
same order in hashmap. E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {
“mno” ,2}
Given list is (“rst”) (“abc”) so it appears in same order. Output should be “true”
If given list is (“abc” ) (“pqr” ) then output should be “false”*/


package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Quetion2 {

	public static void main(String[] args) {
	
		int flag=0;
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		
		lhm.put("abc", 10);
		lhm.put("pqr", 12);
		lhm.put("xyz", 14);
		lhm.put("npm", 16);
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("xyz");
		al.add("pqr");
		
		
		
		 for(Map.Entry<String,Integer> en:lhm.entrySet())
		 {
			 //System.out.println(en.getKey()+"\t"+en.getValue());
			 String str1=en.getKey();
			 for(String str2:al)
			 {
				 if(str1==str2)
				 {
					System.out.println(str1+"...."+str2);
					 flag++;
				 }
				 else
				 {
					 //System.out.println("false");
					 //flag=0;
					 //break;
				 }
				 
			 }
		 }
		 
		 System.out.println();
		 
		 if(flag>0)
		 {
			 System.out.println("true");
		 }
		 else{
			 System.out.println("false");
		 }
		         
	}

}
