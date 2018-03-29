package com.bulls.scm.common.vo;

public class ServiceErrorVO {
	private String errorCode;
	private String errorMessage;
	private String developerMessage;

	public ServiceErrorVO(String errorCode, String errorMessage, String developerMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.developerMessage = developerMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

}
