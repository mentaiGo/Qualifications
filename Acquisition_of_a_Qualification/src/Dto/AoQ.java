package Dto;

public class AoQ {
	private int stid;
	private String name;
	private int grade;
	private int sclass;


	public AoQ(){}

	public AoQ(int stid , String name , int grade , int sclass) {
		this.stid = stid;
		this.name = name;
		this.grade = grade;
		this.sclass = sclass;

	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getSchar() {
		return name;
	}

	public void setSchar(String name) {
		this.name = name;
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

};
