package Collection;

public class Players 
{
	private int plid;
	private String nm;
	private String country;
	private String team;
	
	
	public Players(int plid, String nm, String country, String team) {
		super();
		this.plid = plid;
		this.nm = nm;
		this.country = country;
		this.team = team;
	}
	
	
	public int getPlid() {
		return plid;
	}
	public void setPlid(int plid) {
		this.plid = plid;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	@Override
	public String toString() {
		return "Players [plid=" + plid + ", nm=" + nm + ", country=" + country + ", team=" + team + "]";
	}
	
	
	

}
