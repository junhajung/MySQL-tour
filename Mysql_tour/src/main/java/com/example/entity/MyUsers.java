package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "user")
public class MyUsers{
	
	@Id
	@Column(name="userid")
	private String userid;

	@Column(name="userpw")
	private String userpw;
	
	@Column(name="email")
	private String email;
	
	@Column(name="username")
	private String username;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="userauth")
	private String userauth;
	
	@CreationTimestamp
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "createddate")
    private Date createddate;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserauth() {
		return userauth;
	}

	public void setUserauth(String userauth) {
		this.userauth = userauth;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	


	
}
