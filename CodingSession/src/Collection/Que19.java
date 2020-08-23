/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a map which has alphabets 
 * as keys and integers as values. If alphabet is repeated add integer to old value.
 */

package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Que19 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		
		System.out.println(al.toString());
	
	
	HashMap<String,String> hm=new HashMap<>();
	
	for(int i=0;i<al.size();i++)
	{
		String s1=al.get(i);
		int j=s1.indexOf('+');
		
		hm.put(s1.substring(0, j),s1.substring(j));		//how to add to prev num
		
			//hm.containsValue(s1.get)
		Set<Entry<String, String>> s=hm.entrySet();	
		
			for(Entry<String, String> entry:s)
			{
				Integer numval=(Integer)entry.getValue();
			}
				if(hm.containsKey(s1.substring(0, j)))
				{
				
			}
			/*int num=hm.
					hm.containsValue(s1.substring(j))+;
		}*/
		
		
	}
	System.out.println(hm);

	}

}
