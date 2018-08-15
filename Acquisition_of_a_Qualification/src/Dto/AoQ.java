package Dto;

public class AoQ {
	private int stid;
	private int grade;
	private int sclass;
	private String name;


	public AoQ(){}

	public AoQ(int stid , int grade , int sclass, String name ) {
		this.stid = stid;
		this.grade = grade;
		this.sclass = sclass;
		this.name = name;

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

};
