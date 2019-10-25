package com.form;

public class DetailModel {
	
	private String title;
	private String city;
	private String pc;
	private String description;
	private String email;
	private String phonenumber;
	private String extension;
	private String contactname;
	
	
	public DetailModel(String title, String city, String pc, String description, String email, String phonenumber,
			String extension, String contactname) {
		super();
		this.title = title;
		this.city = city;
		this.pc = pc;
		this.description = description;
		this.email = email;
		this.phonenumber = phonenumber;
		this.extension = extension;
		this.contactname = contactname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

}
