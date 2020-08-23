/*Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}.  
 * Write a program which creates Map where key is Wing_FlatNo and value is List of all  names of 
 * family members*/

package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Que15 {

	public static void main(String[] args) {
		
		Society sc1=new Society(11, 101, "Rathod");
		Society sc2=new Society(12, 103, "Singh");
		Society sc3=new Society(13, 105, "Sheikh");
		Society sc4=new Society(14, 107, "Vihar");
		
		ArrayList<Society> alsc=new ArrayList<>();
		
		alsc.add(sc1);
		alsc.add(sc2);
		alsc.add(sc3);
		alsc.add(sc4);
		
		HashMap<Integer, String> hm=new HashMap<>();
		
		for(Society data:alsc)
		{
			hm.put(data.getWing_flatNo(), data.getName());
		}

		Set<Entry<Integer, String>> s=hm.entrySet();
		for(Map.Entry<Integer, String> data:s)
		{
			System.out.println(data);
		}
		//System.out.println(hm);
	}

}
