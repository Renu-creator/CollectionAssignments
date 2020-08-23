/*Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)*/


package Collection;

import java.util.ArrayList;
import java.util.Comparator;

public class Que7 {

	public static void main(String[] args)
	{
		Movie2 m1=new Movie2(1, "DDLJ", 4);
		Movie2 m2=new Movie2(1, "Dabang", 4);
		Movie2 m3=new Movie2(1, "K2H2", 2);
		Movie2 m4=new Movie2(1, "MS.DHONI", 5);
		
		Theatre t1=new Theatre(101, "ramvihar", "delhi", m1);
		Theatre t2=new Theatre(102, "satidham", "amt", m2);
		Theatre t3=new Theatre(103, "vishal", "pune", m3);
		Theatre t4=new Theatre(104, "vande", "Mum", m4);
		
		ArrayList<Movie2> almovie=new ArrayList<>();
		almovie.add(m1);
		almovie.add(m2);
		almovie.add(m3);
		almovie.add(m4);
		
		ArrayList<Theatre> alth=new ArrayList<>();
		alth.add(t1);
		alth.add(t2);
		alth.add(t3);
		alth.add(t4);
		
		alth.sort(new Comparator<Theatre>()
		{

			@Override
			public int compare(Theatre o1, Theatre o2) 
			{			
				if(o1.getMovie().getMovierating()==o2.getMovie().getMovierating())
				{
					return o1.getThnm().compareTo(o2.getThnm());
				}
				
				return o1.getMovie().getMovierating()-o2.getMovie().getMovierating();
			}
			
		});
		
		
		for(Theatre data:alth)
		{
			System.out.println(data);
		}
					
			
		}
		
		
		
		

		
	}


