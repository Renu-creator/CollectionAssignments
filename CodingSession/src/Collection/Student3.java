package Collection;

public class Student3 implements Comparable<Student3> {
	private int sid;
	private int totalmarks;
	
	
	public Student3(int sid, int totalmarks) {
		super();
		this.sid = sid;
		this.totalmarks = totalmarks;
	}
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) 
	{
		this.totalmarks = totalmarks;
	}
	
	
	@Override
	public String toString() {
		return "Student3 [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}


	@Override
	public int compareTo(Student3 m) {
		
		return m.totalmarks-this.totalmarks;
	}
	
	

}
