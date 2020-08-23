package Collection;

public class Student5
{
	private int sid;
	private String studnm;
	public Student5(int sid, String studnm) {
		super();
		this.sid = sid;
		this.studnm = studnm;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStudnm() {
		return studnm;
	}
	public void setStudnm(String studnm) {
		this.studnm = studnm;
	}
	@Override
	public String toString() {
		return "Student5 [sid=" + sid + ", studnm=" + studnm + "]";
	}
	
	

}
