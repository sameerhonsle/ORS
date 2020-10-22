package com.sunilos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Application")
public class Application {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "ID", unique = true, nullable = false)
	private long id;

	@Column(name = "relatedOffer", length = 50)
	private String relatedOffer;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "resume")
	private String resume;
	
	@Column(name = "applicationStatus")
	private String applicationStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRelatedOffer() {
		return relatedOffer;
	}

	public void setRelatedOffer(String relatedOffer) {
		this.relatedOffer = relatedOffer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	

}
