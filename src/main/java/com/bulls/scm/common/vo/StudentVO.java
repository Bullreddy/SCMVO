package com.bulls.scm.common.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.bulls.scm.vo.ClassificationVO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentVO {

	private int academicYearID;
	
	private ClassificationVO academicYear;

	private Date admissionDate;

	private String admissionNo;

	private BigDecimal alternateMobileNo;

	private int casteID;
	
	private ClassificationVO caste;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date dob;

	private String dualMode;

	private String email;

	private String fatherName;

	private String gender;

	private String highestQualification;

	private int id;
 
	private String category;
	
	private String identificationMarks;

	private BigDecimal mobileNo;

	private String motherName;

	private String name;

	private int phaseID;
	
    private ClassificationVO phase;

	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	private String photoSbmtd;

	private String presentAddress;

	private String registrationNo;

	private String scholarship;

	private String shift;

	private int tradeID;

	private int typeID;

    private ClassificationVO trade;
    
    private ClassificationVO type;
    
	private String UID_Number;

	private String unit;
	
	private List certificateIds;
	
	private boolean photoSubmitted;
	
	private ClassificationVO yearId;

	public int getAcademicYearID() {
		return academicYearID;
	}

	public void setAcademicYearID(int academicYearID) {
		this.academicYearID = academicYearID;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public BigDecimal getAlternateMobileNo() {
		return alternateMobileNo;
	}

	public void setAlternateMobileNo(BigDecimal alternateMobileNo) {
		this.alternateMobileNo = alternateMobileNo;
	}

	public int getCasteID() {
		return casteID;
	}

	public void setCasteID(int casteID) {
		this.casteID = casteID;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDualMode() {
		return dualMode;
	}

	public void setDualMode(String dualMode) {
		this.dualMode = dualMode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentificationMarks() {
		return identificationMarks;
	}

	public void setIdentificationMarks(String identificationMarks) {
		this.identificationMarks = identificationMarks;
	}

	public BigDecimal getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigDecimal mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhaseID() {
		return phaseID;
	}

	public void setPhaseID(int phaseID) {
		this.phaseID = phaseID;
	}

	public String getPhotoSbmtd() {
		return photoSbmtd;
	}

	public void setPhotoSbmtd(String photoSbmtd) {
		this.photoSbmtd = photoSbmtd;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
   @JsonProperty("regNo")
  	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getScholarship() {
		return scholarship;
	}

	public void setScholarship(String scholarship) {
		this.scholarship = scholarship;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public int getTradeID() {
		return tradeID;
	}

	public void setTradeID(int tradeID) {
		this.tradeID = tradeID;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	   @JsonProperty("aadharNo")
	public String getUID_Number() {
		return UID_Number;
	}

	public void setUID_Number(String uID_Number) {
		UID_Number = uID_Number;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public ClassificationVO getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(ClassificationVO academicYear) {
		this.academicYear = academicYear;
	}

	public ClassificationVO getCaste() {
		return caste;
	}

	public void setCaste(ClassificationVO caste) {
		this.caste = caste;
	}

	public ClassificationVO getPhase() {
		return phase;
	}

	public void setPhase(ClassificationVO phase) {
		this.phase = phase;
	}

	public ClassificationVO getTrade() {
		return trade;
	}

	public void setTrade(ClassificationVO trade) {
		this.trade = trade;
	}

	public ClassificationVO getType() {
		return type;
	}

	public void setType(ClassificationVO type) {
		this.type = type;
	}

	public List getCertificateIds() {
		return certificateIds;
	}

	public void setCertificateIds(List certificateIds) {
		this.certificateIds = certificateIds;
	}

	

	public void setPhotoSubmitted(boolean photoSubmitted) {
		this.photoSubmitted = photoSubmitted;
	}

	public ClassificationVO getYearId() {
		return yearId;
	}

	public void setYearId(ClassificationVO yearId) {
		this.yearId = yearId;
	}

	public boolean isPhotoSubmitted() {
		return photoSubmitted;
	}
	
}
