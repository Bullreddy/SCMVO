package com.bulls.scm.common.vo;

public class ServiceErrorVO {
	private String errorCode;
	private String errorMessage;
	private String developerMessage;
	private String property;
	private String moreInfo;
	
	public ServiceErrorVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceErrorVO(String errorCode, String errorMessage, String developerMessage, String property,
			String moreInfo) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.developerMessage = developerMessage;
		this.property = property;
		this.moreInfo = moreInfo;
	}

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

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getMoreInfo() {
		return moreInfo;
	}

	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

}
