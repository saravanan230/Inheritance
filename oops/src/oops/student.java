package oops;

public class student {
	private int sid;
	private String sname;
	private String sUG;
	private String sstream;
	private int sgraduation_year;
	public long getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsUG() {
		return sUG;
	}
	public void setsUG(String sUG) {
		this.sUG = sUG;
	}
	public String getSstream() {
		return sstream;
	}
	public void setSstream(String sstream) {
		this.sstream = sstream;
	}
	public int getSgraduation_year() {
		return sgraduation_year;
	}
	public void setSgraduation_year(int sgraduation_year) {
		this.sgraduation_year = sgraduation_year;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	int mobile_number;
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sUG=" + sUG + ", sstream=" + sstream
				+ ", sgraduation_year=" + sgraduation_year + ", mobile_number=" + mobile_number + "]";
	}

}
