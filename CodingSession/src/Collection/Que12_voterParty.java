/*Create a Map<String,String> where key is adharno  and value is voted casted to
 *  which party(eg. BJP,ShivSena,NCP,Congress,Other) .From this create new map such that KEY is party 
 *  name and value is count of votes casted */

package Collection;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Que12_voterParty 
{
	public static void main(String[] args) 
	{
	HashMap<String, String> hm=new HashMap<>();
	HashMap<String, Integer> hm2=new HashMap<>();

	hm.put("MJ2736HN", "BJP");
	hm.put("RT2396HN", "SHIVSENA");
	hm.put("KJ2546HN", "CONGRESS");
	hm.put("PL2636HN", "NCP");
	hm.put("BB2396HN", "SHIVSENA");
	hm.put("LI7646HN", "CONGRESS");
	hm.put("RG8396HN", "SHIVSENA");
	
	System.out.println(hm);
	
	Set<Entry<String, String>>ss=hm.entrySet();
	
	System.out.println(ss);
	
	for(Entry<String, String> data:ss)
	{
		String party=data.getValue();
		System.out.println(party);
		
		if(hm2.containsKey(party))
		{
			hm2.put(party, hm2.get(party)+1);
			
		}
		else
		{
			hm2.put(party, 1);
		}
		
		
	}
	
	
	System.out.println(hm2);
	
	}

}
