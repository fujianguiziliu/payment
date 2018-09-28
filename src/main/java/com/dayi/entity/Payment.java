package com.dayi.entity;

public class Payment {
	
	private Integer id;
	private String name;
	private String email;
	private String tel;
	private String message;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Payment() {
		super();
	}
	public Payment(Integer id, String name, String email, String tel,
			String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", name=" + name + ", email=" + email
				+ ", tel=" + tel + ", message=" + message + "]";
	}
	
}
