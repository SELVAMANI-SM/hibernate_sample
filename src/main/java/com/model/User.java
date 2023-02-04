package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library_User_Details")
public class User {
@Column(name="NAME")
private String name;
@Column(name="email")
private String email;
@Column(name="mobile")
private String mobile;
@Id
@Column(name="user_Id")
private String userId;
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", mobile=" + mobile + ", userId=" + userId + ", Password="
			+ Password + "]";
}
@Column(name="PASSWORD")
private String Password;
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
}

