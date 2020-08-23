package Collection;

public class Course {

	private int cid;
	private String cnm;
	public Course(int cid, String cnm) {
		super();
		this.cid = cid;
		this.cnm = cnm;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCnm() {
		return cnm;
	}
	public void setCnm(String cnm) {
		this.cnm = cnm;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cnm=" + cnm + "]";
	}
	
	
}
