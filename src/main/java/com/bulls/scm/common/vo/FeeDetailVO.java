package com.bulls.scm.common.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FeeDetailVO {

	private String studentId;
	private String studentName;
	private LocalDateTime collectedDate;
	private String collectedBy;
	private BigDecimal amount;
	private String feeYear;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public LocalDateTime getCollectedDate() {
		return collectedDate;
	}

	public void setCollectedDate(LocalDateTime collectedDate) {
		this.collectedDate = collectedDate;
	}

	public String getCollectedBy() {
		return collectedBy;
	}

	public void setCollectedBy(String collectedBy) {
		this.collectedBy = collectedBy;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getFeeYear() {
		return feeYear;
	}

	public void setFeeYear(String feeYear) {
		this.feeYear = feeYear;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
