package Collection;

import java.util.Arrays;

public class Customer {
	private int cid;
	private String custnm;
	private int [] items;
	public Customer(int cid, String custnm, int[] items) {
		super();
		this.cid = cid;
		this.custnm = custnm;
		this.items = items;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustnm() {
		return custnm;
	}
	public void setCustnm(String custnm) {
		this.custnm = custnm;
	}
	public int[] getItems() {
		return items;
	}
	public void setItems(int[] items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", custnm=" + custnm + ", items=" + Arrays.toString(items) + "]";
	}
	
	

}
