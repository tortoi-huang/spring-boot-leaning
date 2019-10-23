package org.huang.leaning.element.controller;

import org.huang.leaning.lib.EnableDateFormater1;
import org.huang.leaning.lib.EnableDateFormater2;
import org.huang.leaning.lib.MyDateFormater;
import org.huang.leaning.lib.MyElementFormater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//这个bean
	@Autowired
	private MyElementFormater sdf;

	@Autowired
	private MyDateFormater myDateFormater;

	@Autowired(required = false)
	private EnableDateFormater1 enableDateFormater1;

	@Autowired(required = false)
	private EnableDateFormater2 enableDateFormater2;

	@GetMapping("/hello")
	public String hello() {
		return "helle spring boot";
	}

	@GetMapping("/starter")
	public String starter() {
		return "hi starter:" + myDateFormater.sayHello();
	}

	@GetMapping("/element")
	public String element() {
		return "helle element:" + sdf.sayHello();
	}

	@GetMapping("/enable")
	public String enable() {
		return "helle enable:"
				+ (enableDateFormater1 == null ? "enableDateFormater1 is null" : enableDateFormater1.sayHello())
				+ "####"
				+ (enableDateFormater2 == null ? "enableDateFormater2 is null" : enableDateFormater2.sayHello());
	}
}
