package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "reply")
public class Reply {
	
	@Id
	private int index;
	
	@Column(name = "reply")
	private String reply;
	
	@CreationTimestamp
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "createddate")
    private Date createddate;
	
	@Column(name = "userid")
	private String userid;
	
	@Column(name = "name")
	private String name;
	
//	@ManyToOne  
//    @JoinColumn (name = "food_name")
//	private Food food;
//	
	@ManyToOne(optional = false)
    @JoinColumn (name = "index", insertable=false, updatable=false)
	private Tour tour;
	
	
//	@OneToMany(mappedBy = "name", cascade=CascadeType.REMOVE)
//	private List<Tour> tour = new ArrayList<>();
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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



	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}




	
	
}