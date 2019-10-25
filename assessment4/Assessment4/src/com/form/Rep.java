package com.form;

public class Rep {
	private String username;
	private String email1;
	private String phone;
	public Rep(String username, String email1, String phone) {
		super();
		this.username = username;
		this.email1 = email1;
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email) {
		this.email1 = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
