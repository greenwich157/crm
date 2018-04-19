package com.oc.restful.customer;

import org.springframework.hateoas.ResourceSupport;

public class CustomerName extends ResourceSupport{
	private String custId;
	private String name;

	public String getName() {
		return name;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
