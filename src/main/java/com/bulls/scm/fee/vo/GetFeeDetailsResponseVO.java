package com.bulls.scm.fee.vo;

import java.util.List;

import com.bulls.scm.common.vo.FeeDetailVO;
import com.bulls.scm.common.vo.ServiceErrorVO;

public class GetFeeDetailsResponseVO {
	
	private ServiceErrorVO errorVO;

	private List<FeeDetailVO> feeDetails;

	public List<FeeDetailVO> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(List<FeeDetailVO> feeDetails) {
		this.feeDetails = feeDetails;
	}

	public ServiceErrorVO getErrorVO() {
		return errorVO;
	}

	public void setErrorVO(ServiceErrorVO errorVO) {
		this.errorVO = errorVO;
	}

}
