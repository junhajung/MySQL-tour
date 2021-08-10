package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "reply")
public class Reply {
	
	@Id
	private int index;
	
	@Column
	private String id;
	
	private String reply;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdDate = new Date();
	
	private String userid;
	
//	@ManyToOne
	private String name;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate2) {
		this.createdDate = createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", reply=" + reply + ", createdDate=" + createdDate + ", userid=" + userid
				+ ", name=" + name + "]";
	}
	
	
}