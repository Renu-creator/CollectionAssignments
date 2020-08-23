package Collection;

public class Society {

	private int memberid;
	private int Wing_flatNo;
	private String name;
	
	
	public Society(int memberid, int wing_flatNo, String name) {
		super();
		this.memberid = memberid;
		this.Wing_flatNo = wing_flatNo;
		this.name = name;
	}
	
	
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public int getWing_flatNo() {
		return Wing_flatNo;
	}
	public void setWing_flatNo(int wing_flatNo) {
		Wing_flatNo = wing_flatNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Society [memberid=" + memberid + ", Wing_flatNo=" + Wing_flatNo + ", name=" + name + "]";
	}
	
	
	
}
