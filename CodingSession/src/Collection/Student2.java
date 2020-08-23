package Collection;

public class Student2 
{
	private int studid;
	private String studnm;
	private String Qaulif;
	private int yop;
	private Boolean placed;
	
	
	public Student2(int studid, String studnm, String qaulif, int yop, Boolean placed) 
	{
		super();
		this.studid = studid;
		this.studnm = studnm;
		this.Qaulif = qaulif;
		this.yop = yop;
		this.placed = placed;
	}
	
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudnm() {
		return studnm;
	}
	public void setStudnm(String studnm) {
		this.studnm = studnm;
	}
	public String getQaulif() {
		return Qaulif;
	}
	public void setQaulif(String qaulif) {
		Qaulif = qaulif;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public Boolean getPlaced() {
		return placed;
	}
	public void setPlaced(Boolean placed) {
		this.placed = placed;
	}
	
	
	@Override
	public String toString() {
		return "Student2 [studid=" + studid + ", studnm=" + studnm + ", Qaulif=" + Qaulif + ", yop=" + yop + ", placed="
				+ placed + "]";
	}
	
	
	

}
