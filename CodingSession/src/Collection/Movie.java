/*Consider an ArrayList of Movie 
Movie has (int movieid, String moviename, List<String> actor)
Find “Amitabh bachchan has acted in how many movies.*/

package Collection;

import java.util.ArrayList;

public class Movie 
{
	private int movieid;
	private String movienm;
	private ArrayList<String> actor;
	
	
	public Movie(int movieid, String movienm, ArrayList<String> actor) {
		super();
		this.movieid = movieid;
		this.movienm = movienm;
		this.actor = actor;
	}
	
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMovienm() {
		return movienm;
	}
	public void setMovienm(String movienm) {
		this.movienm = movienm;
	}
	public ArrayList<String> getActor() {
		return actor;
	}
	public void setActor(ArrayList<String> actor) {
		this.actor = actor;
	}
	
	
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", movienm=" + movienm + ", actor=" + actor + "]";
	}
	
	

}
