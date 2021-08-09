package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name = "MyMap")
public class MyMap {

	@Id
	private String id;
	
	@Column(name = "userid")
	private String userid;
	
	
	@Column(name = "lat")
	private Double lat;
	
	@Column(name = "lng")
	private Double lng;
	
	@Column(name = "name")
	private String name;
	

	@Column(name = "title")
	private String title;
	

	@Column(name = "memo")
	private String memo;
	
	@Column(name = "addr")
	private String addr;
	
	

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	

}
