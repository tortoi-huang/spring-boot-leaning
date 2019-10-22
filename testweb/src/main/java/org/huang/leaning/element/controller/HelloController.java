package org.huang.leaning.element.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
}
