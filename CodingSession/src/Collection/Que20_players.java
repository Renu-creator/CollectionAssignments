/*Consider List of T20 Players.
Player (playerid,Name,Country,team)
e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
Then find out which team has maximum Australian players.*/

package Collection;

import java.util.ArrayList;

public class Que20_players {

	public static void main(String[] args)
	{
		int c=0;
		String tim = null;
		
		Players p1=new Players(101, "msdhoni", "India", "Chennie");
		Players p2=new Players(102, "wills", "Australia", "Mum");
		Players p3=new Players(103, "john", "Australia", "Chennie");
		Players p4=new Players(104, "williams", "srilanka", "Mum");
		Players p5=new Players(103, "richard", "Australia", "Chennie");
		
		ArrayList<Players> al=new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		for(Players data:al)
		{
			tim=data.getTeam();
			for(Players data2:al)
			{
				String ctry2=data2.getCountry();
				
				if(ctry2=="Australia" && data2.getTeam()==tim)
				{
					c++;
					System.out.println(data2.getTeam()+" "+data2.getCountry());
				}
				else
				{
					continue;
				}
				//c=0;
				/*if(c>1)
				{
					System.out.println(tim);
				}*/
			}
			
		}
		
		


	}

}
