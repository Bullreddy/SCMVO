package com.bulls.scm.common.vo;

import java.math.BigDecimal;

public class UserVO  {
 private String username;
 private String password;

private String email;
 private BigDecimal contactNo;
 
 public String getUsername() {
		return username;
	}

	public void setUsername(String UserName) {
		this.username = UserName;
	}
	
	 public String getPassword() {
			return password;
		}

		public void setPassword(String Password) {
			this.password = Password;
		}
		
		 public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
			 public BigDecimal getContactNo() {
					return contactNo;
				}

				public void setContactNo(BigDecimal contactNo) {
					this.contactNo = contactNo;
				}
}
