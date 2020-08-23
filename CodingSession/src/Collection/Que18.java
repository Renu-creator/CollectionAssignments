/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
method which accepts a String eg D in input and will return
associated number value eg in this case 4 by looping the arraylist and
finding matching pattern*/

package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Que18 {

	public static void main(String[] args) {
		
//can we create map???
		
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
		
		hm.put(s1.substring(0, j),s1.substring(j+1));
		
	}

	System.out.println(hm);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string val");
	String str=sc.next();
	
	Set<Entry<String, String>>entry=hm.entrySet();
	
	/*for(String data:hm.keySet())
	{
		//String val=data.getKey();
		System.out.println(data);
		
		for(String val:hm.values())
		{*/
	
	Iterator<Entry<String, String>> itr=hm.entrySet().iterator();
	while(itr.hasNext())
	{
		Map.Entry<String, String> en=itr.next();
		String val=en.getKey();
		if(val==str)
		{
			System.out.println(en.getValue());
		}
		
	}
	}
}
