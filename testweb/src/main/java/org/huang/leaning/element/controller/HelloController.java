package org.huang.leaning.element.controller;

import org.huang.leaning.lib.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
	//这个bean
	@Autowired
	private ElementFormatter elementFormatter;

	@Autowired
	private StarterDateFormatter starterDateFormatter;

	@Autowired
	private EnableDateFormatter enableDateFormatter;

	@Autowired(required = false)
	private EnableDateFormatter1 enableDateFormatter1;

	@Autowired(required = false)
	private EnableDateFormatter2 enableDateFormatter2;

	@GetMapping("/hello")
	public String hello() {
		return "helle spring boot";
	}

	@GetMapping("/starter")
	public String starter() {
		return "hi starter:" + starterDateFormatter.sayHello(new Date());
	}

	@GetMapping("/element")
	public String element() {
		return "helle element:" + elementFormatter.sayHello(new Date());
	}

	@GetMapping("/enable")
	public String enable() {
		Date date = new Date();
		return "helle enable:"
				+ (enableDateFormatter == null ? "enableDateFormater is null" : enableDateFormatter.sayHello(date))
				+ "####"
				+ (enableDateFormatter1 == null ? "enableDateFormater1 is null" : enableDateFormatter1.sayHello(date))
				+ "####"
				+ (enableDateFormatter2 == null ? "enableDateFormater2 is null" : enableDateFormatter2.sayHello(date));
	}
}
