package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "naver")
public class Naver_guide {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	private String id;
	
	@Column(name = "image")
	private byte[] image;
	
	@Column(name = "link")
	private String link;
	
	@Column(name = "title")
	private String title;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	
	
}
