package com.oc.restful.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	private List<Customer> customers = new ArrayList<>(Arrays.asList(
			new Customer("1257", "John Doe", "johndoe@gmail.com", "91234567"),	
			new Customer("3326", "Tan Ah Kau", "ahbeng@outlook.com", "98881288"),	
			new Customer("6101", "Tony Stark", "tony@starkcorp.com", "classified")));

	private List<Product> product = new ArrayList<>(Arrays.asList(
			new Product("1257", "Combo 6", "6GB Data + 2GB Singtel Wifi"),	
			new Product("3326", "2Gbps Fibre", "2Gbps Fibre Home Bundle"),	
			new Product("6101", "Value Packs", "Choose from 5 packs")));
	
	public List<Customer> getAllCustomers(){
		return customers;
	}
	
	public Customer getCustomer(String id) {
		return customers.stream().filter(t -> t.getCustId().equals(id)).findFirst().get();
	}
	
	public Product getCustomerProduct(String id) {
		return product.stream().filter(t -> t.getCustId().equals(id)).findFirst().get();
	}
}
