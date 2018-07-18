package com.bulls.scm.vo;

import java.util.List;

public class StudentRequestVO {
	
	private String phaseID;
	
	private String academicYearID;
	
	private String tradeID;
	
	private String branchID;
	
	private List students;

	public String getPhaseID() {
		return phaseID;
	}

	public void setPhaseID(String phaseID) {
		this.phaseID = phaseID;
	}

	public String getAcademicYearID() {
		return academicYearID;
	}

	public void setAcademicYearID(String academicYearID) {
		this.academicYearID = academicYearID;
	}

	public String getTradeID() {
		return tradeID;
	}

	public void setTradeID(String tradeID) {
		this.tradeID = tradeID;
	}

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}

	public List getStudents() {
		return students;
	}

	public void setStudents(List students) {
		this.students = students;
	}
	
}
