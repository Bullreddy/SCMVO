package com.bulls.scm.vo;

import java.util.List;

import com.bulls.scm.common.vo.ClassificationType;

public class GetClassificationRequestVO {

/*	private List<ConfigurationTypeVO> types;

	public List<ConfigurationTypeVO> getTypes() {
		return types;
	}

	public void setTypes(List<ConfigurationTypeVO> types) {
		this.types = types;
	}*/
	
	private List<ClassificationType> types;
	
	private String scholarshipType;
	
	private String branchID;

	public List<ClassificationType> getTypes() {
		return types;
	}

	public void setTypes(List<ClassificationType> types) {
		this.types = types;
	}

	public String getScholarshipType() {
		return scholarshipType;
	}

	public void setScholarshipType(String scholarshipType) {
		this.scholarshipType = scholarshipType;
	}

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}
	
	
	
}
