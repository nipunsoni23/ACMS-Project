package com.acms.application.model;



import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedback")
public class Feedback {

	private String id;
	
	public Integer averagerating;
	
	@Size(min=4, max=6)
	private String storeid;
	
	private Integer rating1;
	
	private Integer rating2;
	
	private String description;
	
	private Integer rating3;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getStoreid() {
		return storeid;
	}

	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}
	
	public Integer getRating1() {
		return rating1;
	}

	public void setRating1(Integer rating1) {
		this.rating1 = rating1; 
	}
	public Integer getAvg() {
		return averagerating;
	}

	public void setAvg(Integer rating1,Integer rating2, Integer rating3) {
		this.averagerating = rating1+rating2+rating3;
	}
	
	public Integer getRating2() {
		return rating2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRating2(Integer rating2) {
		this.rating2 = rating2;
	}

	public Integer getRating3() {
		return rating3;
	}

	public void setRating3(Integer rating3) {
		this.rating3 = rating3;
	}
	
}
