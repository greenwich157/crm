package com.oc.restful.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/customers", produces = "application/hal+json")
	public List<CustomerName> getAllCustomers() {
		ArrayList<CustomerName> custName = new ArrayList<CustomerName>();
		List<Customer> customer = customerService.getAllCustomers();

		for (int i=0; i<customer.size(); i++) {
			String customerId = customer.get(i).getCustId();
			CustomerName tmpCustName = new CustomerName();
			tmpCustName.setName(customer.get(i).getName());
			tmpCustName.setCustId(customer.get(i).getCustId());
			Link selfLink = linkTo(CustomerController.class).slash("customers").slash(customerId).withRel("profile");
			tmpCustName.add(selfLink);
			custName.add(tmpCustName);
		}
		
		return custName;
	}
	
	
	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable String id) {
		Customer customer = customerService.getCustomer(id);
		Link selfLink = linkTo(CustomerController.class).slash("customers").slash(id).slash("product").withRel("product");
		customer.add(selfLink);
		Link selfLink2 = linkTo(CustomerController.class).slash("customers").slash(id).slash("bill").withRel("bill");
		customer.add(selfLink2);
		return customer;
	}
	
	@RequestMapping("/customers/{id}/product")
	public Product getCustomerProducts(@PathVariable String id) {
		return customerService.getCustomerProduct(id);
	}
	
}
