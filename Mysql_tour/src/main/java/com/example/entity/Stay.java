package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Id;

@Entity
@Table(name = "stay")
public class Stay {
	@Id
	private int index;

	@Column(name = "region")
	private String region;

	@Column(name = "kate")
	private String kate;

	@Column(name = "name")
	private String name;
	
	
	@Column(name = "addr")
	private String addr;

	@Column(name = "lat")
	private Double lat;

	@Column(name = "lng")
	private Double lng;
	
	@Column(name = "info") // 객실정보
	private String info;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "image")
	private byte[] image;
	
	@Transient // 컬럼생성하지 않음
	private String base64;

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getRegion() {
		return region;
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
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
