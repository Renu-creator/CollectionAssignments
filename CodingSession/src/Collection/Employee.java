package Collection;

public class Employee {

	private int id;
	private String name;
	private int mgnid;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, int mgnid) {
		super();
		this.id = id;
		this.name = name;
		this.mgnid = mgnid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMgnid() {
		return mgnid;
	}
	public void setMgnid(int mgnid) {
		this.mgnid = mgnid;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mgnid=" + mgnid + "]";
	}
	
	

}
