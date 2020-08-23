package Collection;

import java.util.ArrayList;

public class Student {
	
		private int sid;
		private String snm;

		ArrayList<String> al=new ArrayList<String>();

		public Student(int sid, String snm, ArrayList<String> al) {
			super();
			this.sid = sid;
			this.snm = snm;
			this.al = al;
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSnm() {
			return snm;
		}

		public void setSnm(String snm) {
			this.snm = snm;
		}

		public ArrayList<String> getAl() {
			return al;
		}

		public void setAl(ArrayList<String> al) {
			this.al = al;
		}

		@Override
		public String toString() {
			return "Student [sid=" + sid + ", snm=" + snm + ", al=" + al + "]";
		}
		
		
		
}
