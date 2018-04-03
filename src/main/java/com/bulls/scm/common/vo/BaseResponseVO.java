package com.bulls.scm.common.vo;

import com.bulls.scm.common.vo.ServiceErrorVO;

public class BaseResponseVO {

	private ServiceErrorVO errorVO;

	public ServiceErrorVO getErrorVO() {
		return errorVO;
	}

	public void setErrorVO(ServiceErrorVO errorVO) {
		this.errorVO = errorVO;
	}

}
