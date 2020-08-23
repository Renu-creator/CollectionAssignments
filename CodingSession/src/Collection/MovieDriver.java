/*Consider an ArrayList of Movie 
Movie has (int movieid, String moviename, List<String> actor)
Find “Amitabh bachchan has acted in how many movies.*/

package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class MovieDriver {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("aamir");
		al.add("shahi");
		al.add("amitabh");
		ArrayList<String> al1=new ArrayList<>();
		al1.add("sharukh");
		al1.add("shahi");
		al1.add("vivek");
		ArrayList<String> al2=new ArrayList<>();
		al2.add("arbaz");
		al2.add("shan");
		al2.add("amitabh");
		ArrayList<String> al3=new ArrayList<>();
		al3.add("sohial");
		al3.add("tiger");
		al3.add("vihan");
		
		Movie m1=new Movie(1, "DDLJ", al);
		Movie m2=new Movie(2, "HUM", al1);
		Movie m3=new Movie(3, "Sholey", al2);
		Movie m4=new Movie(4, "K2H2", al3);
		
		ArrayList<Movie> al_movie=new ArrayList<>();
		
		al_movie.add(m1);
		al_movie.add(m2);
		al_movie.add(m3);
		al_movie.add(m4);
		
		//Iterator<Movie> itr
		
		for(Movie data:al_movie)
		{
			ArrayList<String> actor_list=data.getActor();
			
			for(String actor_nm:actor_list)
			{
				if(actor_nm=="amitabh")
				{
					System.out.println("Amitabh has acted in following movies : "+data.getMovienm());
				}
			}
			
		}

	}

}
