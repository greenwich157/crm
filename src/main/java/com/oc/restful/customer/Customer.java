package com.oc.restful.customer;

import org.springframework.hateoas.ResourceSupport;

public class Customer extends ResourceSupport{
	private String custId;
	private String name;
	private String email;
	private String contact;
	
	public Customer() {
		
	}
	
	public Customer(String custId, String name, String email, String contact)
	{
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
