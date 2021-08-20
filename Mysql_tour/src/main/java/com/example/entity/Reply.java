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
	
	
	@Column(name = "name")
	private String name;
	
//	@ManyToOne
//    @JoinColumn (name = "tour_reply") //외래키
//	private Tour tour;
//	
//	
//	@ManyToOne
//    @JoinColumn (name = "food_reply") //외래키
//	private Food food;
//	
	@ManyToOne
    @JoinColumn (name = "stay_reply") //외래키
	private Stay stay;
	
	@ManyToOne
    @JoinColumn (name = "userid") //외래키
	private MyUsers userid;
	
	
//	public Food getFood() {
//		return food;
//	}
//
//	public void setFood(Food food) {
//		this.food = food;
//	}

	public Stay getStay() {
		return stay;
	}

	public void setStay(Stay stay) {
		this.stay = stay;
	}

//	public Tour getTour() {
//		return tour;
//	}
//
//	public void setTour(Tour tour) {
//		this.tour = tour;
//	}
	
	
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

	public MyUsers getUserid() {
		return userid;
	}

	public void setUserid(MyUsers userid) {
		this.userid = userid;
	}

	
	
	
	
}