package Collection;

public class Student6 {
	
	private int studid;
	private String studnm;
	
	public Student6(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
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
	
	
	@Override
	public String toString() {
		return "Student6 [studid=" + studid + ", studnm=" + studnm + "]";
	}
	
	
	

}
