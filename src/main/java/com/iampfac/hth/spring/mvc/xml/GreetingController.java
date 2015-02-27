package com.iampfac.hth.spring.mvc.xml;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@RequestMapping(method = RequestMethod.GET)
	public Greeting getGreeting() {
		return new Greeting("world");
	}

}
