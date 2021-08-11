package com.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "User")
public class MyUsers{
	
	@Id
	private String userid;

	private String userpw;
	
	private String email;
	
	private String username;
	
	private String phone;
	
	private String userauth;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdDate = new Date();

//	@OneToMany
//	private List<Reply> reply;
	
	// 댓글 구현
	

	public String getUserid() {
		return userid;
	}
	
	
//	public List<Reply> getReply() {
//		return reply;
//	}
//
//
//	public void setReply(List<Reply> reply) {
//		this.reply = reply;
//	}


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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	
}
