package com.jobplatform.user.entity;

public class User {
	
	public String userId;
	public String userPassword;
	public String userKeyWord;
	public String createDateTime;
	public String updateDateTime;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserKeyWord() {
		return userKeyWord;
	}
	public void setUserKeyWord(String userKeyWord) {
		this.userKeyWord = userKeyWord;
	}
	public String getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	
	

}
