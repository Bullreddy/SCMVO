package com.bulls.scm.fee.vo;

import java.util.List;

import com.bulls.scm.common.vo.FeeDetailVO;
import com.bulls.scm.common.vo.ServiceErrorVO;
import com.bulls.scm.common.vo.StudentVO;

public class GetFeeDetailsResponseVO {
	
	private ServiceErrorVO errorVO;

	private List<FeeDetailVO> feeDetails;
	
	private List<StudentVO> studentDetails;

	public List<FeeDetailVO> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(List<FeeDetailVO> feeDetails) {
		this.feeDetails = feeDetails;
	}
	
	public List<StudentVO> getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(List<StudentVO> studentDetails) {
		this.studentDetails = studentDetails;
	}

	public ServiceErrorVO getErrorVO() {
		return errorVO;
	}

	public void setErrorVO(ServiceErrorVO errorVO) {
		this.errorVO = errorVO;
	}

}
