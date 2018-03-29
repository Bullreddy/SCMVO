package com.bulls.scm.vo;

import java.util.List;

import com.bulls.scm.common.vo.ServiceErrorVO;

public class GetClassificationResponseVO {
	private int status;
	private List<ClassificationVO> classifications;
	private ServiceErrorVO errorVO;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<ClassificationVO> getClassifications() {
		return classifications;
	}

	public void setClassifications(List<ClassificationVO> classifications) {
		this.classifications = classifications;
	}

	public ServiceErrorVO getErrorVO() {
		return errorVO;
	}

	public void setErrorVO(ServiceErrorVO errorVO) {
		this.errorVO = errorVO;
	}

}
