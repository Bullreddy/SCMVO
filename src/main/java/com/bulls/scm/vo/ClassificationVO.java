package com.bulls.scm.vo;

import com.bulls.scm.common.vo.ClassificationType;

public class ClassificationVO {

	private String id;

	private String code;

	private String name;

	private ClassificationType type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClassificationType getType() {
		return type;
	}

	public void setType(ClassificationType type) {
		this.type = type;
	}

}
