package com.luu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
   @Id  
   @GeneratedValue(strategy = GenerationType.AUTO)  
   private Long userId;  

   @Column  
   private String userName;  

	@Column
	private String email;  
	
	@Column  
	private String phone;  
	
	public User() {}  
	
	public User(String name, String email, String phone) {  
		this.userName = name;  
	    this.email = email;  
	    this.phone = phone;  
	}  
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public String getEmail() {  
	    return email;  
	}  

	public void setEmail(String email) {  
	    this.email = email;  
	}  

	public String getPhone() {  
	     return phone;  
	 }  

	public void setPhone(String phone) {  
		this.phone = phone;  
	 }  
}
