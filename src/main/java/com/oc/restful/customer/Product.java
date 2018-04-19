package com.oc.restful.customer;

public class Product {
	private String custId;
	private String name;
	private String desc;

	public Product (String custId, String name, String desc) {
		this.custId = custId;
		this.name = name;
		this.desc = desc;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Product() {
		
	}
}

