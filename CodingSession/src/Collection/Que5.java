package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Que5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="pizzapan";
		//int c=0;
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		char s[]=str.toCharArray();
		
		//for(int i=0;i<=s.length;i++)
		
		for(char var:s)
		{
			//c++;
			if(hm.containsKey(var))
			{
				//System.out.println( hm.get(var));
				hm.put(var, hm.get(var)+1);
			}
			
			else
			{
				hm.put(var, 1);
			}
			
		}
		
		System.out.println(hm);
		
		Set<Entry<Character, Integer>>en=hm.entrySet();
		
		Iterator<Entry<Character, Integer>>itr=en.iterator();
		while(itr.hasNext())
		{
		
			Map.Entry<Character, Integer> data=itr.next();
			char ch=data.getKey();
			int occ=data.getValue();
			System.out.println(ch+" "+occ);
		}
		
	}


	

}
