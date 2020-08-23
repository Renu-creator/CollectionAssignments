

package Collection;

public class Theatre {
	
	private int thid;
	private String thnm;
	private String loc;
	private Movie2 movie;
	
	
	public Theatre(int thid, String thnm, String loc, Movie2 movie) {
		super();
		this.thid = thid;
		this.thnm = thnm;
		this.loc = loc;
		this.movie = movie;
	}
	
	

	public int getThid() {
		return thid;
	}

	public void setThid(int thid) {
		this.thid = thid;
	}

	public String getThnm() {
		return thnm;
	}

	public void setThnm(String thnm) {
		this.thnm = thnm;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Movie2 getMovie() {
		return movie;
	}

	public void setMovie(Movie2 movie) {
		this.movie = movie;
	}

	
	
	@Override
	public String toString() {
		return "Theatre [thid=" + thid + ", thnm=" + thnm + ", loc=" + loc + ", movie=" + movie + "]";
	}
	
	

}
