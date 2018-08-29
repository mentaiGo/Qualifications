package Dto;

import java.sql.Date;

public class AoQ {
	private int stid;
	private int grade;
	private int sclass;
	private String name;
	private String quaname;
	private Date exa;
	private boolean so;
	private int Sid;

	public AoQ(int stid , int grade , int sclass, String name ) {
		this.stid = stid;
		this.grade = grade;
		this.sclass = sclass;
		this.name = name;
	}
	public AoQ(int Sid,String name, String quaname, Date exa, boolean so) {
		this.Sid = Sid;
		this.name=name;
		this.quaname = quaname;
		this.exa = exa;
		this.so = so;
	}
	public AoQ(int Sid, String quaname, Date exa, boolean so) {
		this.Sid = Sid;
		this.quaname = quaname;
		this.exa = exa;
		this.so = so;
	}
	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSclass() {
		return sclass;
	}

	public void setSclass(int sclass) {
		this.sclass = sclass;
	}
	public String getSchar() {
		return name;
	}

	public void setSchar(String name) {
		this.name = name;
	}

	public int getSid() {
		return Sid;
	}

	public void setSid(int Sid) {
		this.Sid = Sid;
	}

	public String getQna() {
		return quaname;
	}

	public void setQna(String quaname) {
		this.quaname = quaname;
	}

	public Date getExa() {
		return exa;
	}

	public void setExa(Date exa) {
		this.exa = exa;
	}

	public boolean getSo() {
		return so;
	}

	public void setSo(boolean so) {
		this.so = so;
	}

}
