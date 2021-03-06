package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tour") // mongodb에 생성될 collection이름
public class Tour {
	@Id
	private int id;
	
	@Column(name = "region")
	private String region;

	@Column(name = "kate")
	private String kate;

	@Column(name = "tag")
	private String tag;

	@Column(name = "name")
	private String name;

	@Column(name = "addr")
	private String addr;

	@Column(name = "lat")
	private Double lat;

	@Column(name = "lng")
	private Double lng;

	@Column(name = "subtitle")
	private String subtitle;

	@Column(name = "others")
	private String others;

	@Column(name = "content")
	private String content;
	
	@Column(name = "image")
	private byte[] image;
	
	@ManyToOne
    @JoinColumn (name = "top8") //외래키
	private TOP8 top8;
	
//	@OneToMany(mappedBy = "tour", cascade=CascadeType.REMOVE)
//	private List<Reply> reply = new ArrayList<>();

	
	public String getRegion() {
		return region;
	}

	public TOP8 getTop8() {
		return top8;
	}

	public void setTop8(TOP8 top8) {
		this.top8 = top8;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getKate() {
		return kate;
	}

	public void setKate(String kate) {
		this.kate = kate;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
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

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}



	
}
