package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "reply")
public class Reply {
	
	@Id
	private int index;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "reply")
	private String reply;
	
	@CreationTimestamp
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "created_Date")
    private Date createdDate;
	
	@Column(name = "userid")
	private String userid;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne  
    @JoinColumn (name = "name", insertable=false, updatable=false)
	private Food food_name;
	
	@ManyToOne  
    @JoinColumn (name = "name", insertable=false, updatable=false)
	private Stay stay_name;
	
	@ManyToOne  
    @JoinColumn (name = "name", insertable=false, updatable=false)
	private Tour tour_name;
	
	

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Food getFood_name() {
		return food_name;
	}

	public void setFood_name(Food food_name) {
		this.food_name = food_name;
	}

	public Stay getStay_name() {
		return stay_name;
	}

	public void setStay_name(Stay stay_name) {
		this.stay_name = stay_name;
	}

	public Tour getTour_name() {
		return tour_name;
	}

	public void setTour_name(Tour tour_name) {
		this.tour_name = tour_name;
	}


	
	
}