package com.wf.bean;

public class Student {
	private Integer sid;
	private String sname;
	private boolean gender;
	private String hobby;
	private String mark;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", hobby=" + hobby + ", mark=" + mark
				+ "]";
	}
	public Student(Integer sid, String sname, boolean gender, String hobby, String mark) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.hobby = hobby;
		this.mark = mark;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
