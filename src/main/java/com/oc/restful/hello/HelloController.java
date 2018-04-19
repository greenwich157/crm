package com.oc.restful.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String greetings() {
		return "<H1>Network Service Bus Demo</H1>";
	}
}
