package com.bezkoder.integrate.spring.react.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials") //litigation
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;
	
	@Column(name = "deadline")
	private String deadline;
	
	@Column(name = "staff")
	private String staff;
	
	@Column(name = "steps")
	private String steps;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "counsel")
	private String counsel;
	
	@Column(name = "doc")
	private String doc;
	
	@Column(name = "updated")
	private String updated;

	@Column(name = "published")
	private boolean published;

	public Tutorial() {

	}

	public Tutorial(String title, String description, String deadline, String staff, String steps, String type, String counsel, String doc, String updated, boolean published) {
		this.title = title;
		this.description = description;
		this.deadline = deadline;
		this.staff = staff;
		this.steps = steps;
		this.type = type;
		this.counsel = counsel;
		this.doc = doc;
		this.updated = updated;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDeadline() {
		return deadline;
	}
	
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	public String getStaff() {
		return staff;
	}
	
	public void setStaff(String staff) {
		this.staff = staff;
	}
	
	public String getSteps() {
		return steps;
	}
	
	public void setSteps(String steps) {
		this.steps = steps;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCounsel() {
		return counsel;
	}
	
	public void setCounsel(String counsel) {
		this.counsel = counsel;
	}

	public String getDoc() {
		return doc;
	}
	
	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getUpdated() {
		return updated;
	}
	
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	
	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}

}
