package com.oc.restful.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@RequestMapping("/")
	public String greetings() throws InterruptedException {
		// Thread.sleep(3000);
		return "<H1>Network Service Bus Demo</H1>";
	}
}
