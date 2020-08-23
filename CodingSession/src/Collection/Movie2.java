package Collection;

public class Movie2 
{
	private int movieid;
	private String moviename;
	private int movierating;
	
	
	public Movie2(int movieid, String moviename, int movierating) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.movierating = movierating;
	}
	
	
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public int getMovierating() {
		return movierating;
	}
	public void setMovierating(int movierating) {
		this.movierating = movierating;
	}
	
	
	@Override
	public String toString() {
		return "Movie2 [movieid=" + movieid + ", moviename=" + moviename + ", movierating=" + movierating + "]";
	}
	
	
	

}
