package com.example.springDemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userMaster")
public class AuthenticateMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userMasterId;
	private String userName;
	private String password;

	public Integer getUserMasterId() {
		return userMasterId;
	}

	public void setUserMasterId(Integer userMasterId) {
		this.userMasterId = userMasterId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
